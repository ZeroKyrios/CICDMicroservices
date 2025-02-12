package com.bancolombia.app.services;

import java.util.List;

import com.bancolombia.app.entities.Client;

public interface IService {
	
	boolean insert(Client cl);
	List<Client> SelectAll();
}
