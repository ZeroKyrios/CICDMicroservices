package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Client;
import com.bancolombia.app.services.IService;

@RestController//json
@RequestMapping("/client")
public class MicroController {

	@Autowired
	private IService service;
	
	@PostMapping
	public ResponseEntity<String> insert (@RequestBody Client cl){
		if(service.insert(cl)) {
			return new ResponseEntity<String>("Insertado",HttpStatus.CREATED);
		}else return new ResponseEntity<String>("Error",HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	public ResponseEntity<List<Client>> selectAll (){
		
		//Otra forma de hacerlo mediante programación funcional reactiva.
		//Stream.of(service.selectAll()).filter(t->!t.isEmpty())
		//.map(t->new ResponseEntity<List<Client>>(service.selectAll(),HttpStatus.OK))
		//.findFirst()
		//.orElseThrow();
		
		return new ResponseEntity<List<Client>>(service.SelectAll(),HttpStatus.OK);
		
	}
	
}
