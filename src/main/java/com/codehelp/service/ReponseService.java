package com.codehelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.codehelp.domain.Reponse;

import com.codehelp.repository.ReponseRepository;

@Service
public class ReponseService {
	
	@Autowired
	private ReponseRepository reponseRepository;
	
	public void addReponse(Reponse reponse) {
		
		reponseRepository.save(reponse);
	}
	
	public Reponse findReponse(long id) {
		return this.reponseRepository.getOne(id);
		
	}
	
	public List<Reponse> findAll(){
		return this.reponseRepository.findAll();
		
	}
	
	public void deleteReponse(long id) {
		 reponseRepository.deleteById(id);
		
	}
	
	public Reponse updateReponse(Reponse reponse) {
		return this.reponseRepository.save(reponse);
		
	}

}
