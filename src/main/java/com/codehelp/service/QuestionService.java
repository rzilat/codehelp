package com.codehelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehelp.domain.Question;

import com.codehelp.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public void addQuestion(Question question) {
		
		questionRepository.save(question);
		
	}
	
	public Question findQuestion(long id) {
		return this.questionRepository.getOne(id);
		
	}
	
	public List<Question> findAll(){
		return this.questionRepository.findAll();
		
	}
	
	public void deleteQuestion(long id) {
		 questionRepository.deleteById(id);
		
	}
	
	public Question updateUser(Question question) {
		return this.questionRepository.save(question);
		
	}

}
