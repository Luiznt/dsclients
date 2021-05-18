package com.devsuperior.dsclients.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsclients.dto.ClientDTO;
import com.devsuperior.dsclients.entities.Client;
import com.devsuperior.dsclients.repositories.ClientRepository;



@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		return list.stream().map(x-> new ClientDTO(x)).collect(Collectors.toList());
	}
		
	
}
