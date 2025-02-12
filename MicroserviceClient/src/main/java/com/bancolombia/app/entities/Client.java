package com.bancolombia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//Todas estas importaciones se hicieron con ctrl+Space

@Entity //Esto es un decorador que le dice al ORM que esta es una tabla. Si a la clase se le agregan atributos, los convierte en columnas.
@Table(name="clients")  //
public class Client {
	@Id //Permite definir esta como la llave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Define que la base de datos le de el valor de forma incremental y mediante una estrategia de Identidad.
	private long id;
	@Column(length=50)
	private String name;
	@Column(length=50)
	private String email;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
