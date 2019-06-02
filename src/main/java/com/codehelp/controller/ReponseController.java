package com.codehelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.codehelp.domain.Reponse;
import com.codehelp.service.ReponseService;

@RestController
@RequestMapping(value= "/codehelp")
public class ReponseController {
	
	@Autowired
	private ReponseService reponseService;
	
	@RequestMapping(value= "/Reponse", method= RequestMethod.GET)
	public ResponseEntity <List<Reponse>>getAllReponses(){
		List<Reponse> reponses= reponseService.findAll();
		return new ResponseEntity <>(reponses,HttpStatus.OK);
		
	}
	
	@RequestMapping(value= "/reponse", method= RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addReponse(@RequestBody Reponse reponse) {
		reponseService.addReponse(reponse);
		
	}
	

}
