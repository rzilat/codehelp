package com.codehelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.codehelp.domain.Reponse;

import com.codehelp.service.ReponseService;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value= "/codehelp")
public class ReponseController {
	
	@Autowired
	private ReponseService reponseService;
	
	@RequestMapping(value= "/reponses", method= RequestMethod.GET)
	public ResponseEntity <List<Reponse>>getAllReponses(){
		List<Reponse> reponses= reponseService.findAll();
		return new ResponseEntity <>(reponses,HttpStatus.OK);
		
	}
	
	@RequestMapping(value= "/reponse", method= RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addReponse(@RequestBody Reponse reponse) {
		reponseService.addReponse(reponse);
		
	}
	@RequestMapping(value= "/reponse/{id}", method= RequestMethod.GET)
	public ResponseEntity <Reponse> getReponse(@PathVariable("id")long id){
		
		Reponse reponse= reponseService.findReponse(id);
		return new ResponseEntity <> (reponse,HttpStatus.OK);
		
	}
	
	@RequestMapping(value= "/reponse/{id}", method= RequestMethod.DELETE)
	public void deleteReponse(@PathVariable("id")long id){
		reponseService.deleteReponse(id);
	}
	
	@RequestMapping(value= "/reponse", method= RequestMethod.PUT)
	public ResponseEntity <Reponse> updateUser(@RequestBody Reponse reponse) {
		return new ResponseEntity <> (reponseService.updateReponse(reponse),HttpStatus.OK);
		
	}
	
	@RequestMapping(value= "/reponses/findByQuestionId/{questionId}", method=RequestMethod.GET)
	public ResponseEntity<List<Reponse>> getReponsesByQuestionId(@PathVariable("questionId")long questionId)
	
	{
		List<Reponse> reponseList= reponseService.findReponsesByQuestionId(questionId);
		return new ResponseEntity<>(reponseList,HttpStatus.OK);
	}
	
	

}
