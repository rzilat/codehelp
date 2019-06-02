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

import com.codehelp.domain.Question;
import com.codehelp.service.QuestionService;

@RestController
@RequestMapping(value= "/codehelp")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping(value= "/questions", method= RequestMethod.GET)
	public ResponseEntity <List<Question>> getAllQuestions(){
		List<Question> questions= questionService.findAll();
		return new ResponseEntity <> (questions,HttpStatus.OK) ;
		}
	
	@RequestMapping(value= "/question", method= RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addQuestion(@RequestBody Question question) {
		questionService.addQuestion(question);
	}
}