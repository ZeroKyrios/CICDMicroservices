package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.dao.IClientDAO;
import com.bancolombia.app.entities.Client;

@Service //Hace que la clase sea del tipo Singleton
public class ServiceImpl implements IService {

	@Autowired//Esto sirve para cargar en memoria el objeto. Es de spring para no tener que hacer el new()
	private IClientDAO dao;
	
	@Override
	public boolean insert(Client cl) {
		
		return dao.save(cl)!=null;
	}

	@Override
	public List<Client> SelectAll() {
		
		return (List<Client>)dao.findAll();
	}


}
