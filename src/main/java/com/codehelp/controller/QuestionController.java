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
	
	@RequestMapping(value= "/question/{id}", method= RequestMethod.GET)
	public ResponseEntity <Question> getQuestion(@PathVariable("id")long id){
		
		Question question= questionService.findQuestion(id);
		return new ResponseEntity <> (question,HttpStatus.OK);
		
	}
	
	@RequestMapping(value= "/question/{id}", method= RequestMethod.DELETE)
	public void deleteQuestion(@PathVariable("id")long id){
		questionService.deleteQuestion(id);
	}
	
	@RequestMapping(value= "/question", method= RequestMethod.PUT)
	public ResponseEntity <Question> updateUser(@RequestBody Question question) {
		return new ResponseEntity <> (questionService.updateUser(question),HttpStatus.OK);
		
	}
	
	@RequestMapping(value= "/questions/findQuestionByTag/{tag}", method= RequestMethod.GET)
	public ResponseEntity <List<Question>> getAllQuestionsByTag(@PathVariable ("tag")String tag){
		List<Question> questionsList= questionService.findQuestionByTags(tag);
		return new ResponseEntity <> (questionsList,HttpStatus.OK) ;
		}
	
	@RequestMapping(value= "/question/{id}/{vote}", method= RequestMethod.POST)
	public void voteQuestion(@PathVariable("id")long id,@PathVariable("vote")int vote){
		questionService.voteQuestion(id, vote);
	}
	
}