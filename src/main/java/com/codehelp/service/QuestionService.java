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
	@Autowired
    private UserService userService;
	
	public void addQuestion(Question question) {
		question.setVote(0);
		userService.incrementParticipation(question.getUser().getUserId());
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
	
	public Question updateQuestion(Question question) {
		return this.questionRepository.save(question);
	}
	
	public List<Question> findQuestionByTags(String tag){
		return this.questionRepository.findByTagsContaining(tag);
	}
	
	public void voteQuestion(long questionId, int vote) {
		Question question= questionRepository.getOne(questionId);
		int oldVote=question.getVote();
		int newVote=oldVote+vote;
		question.setVote(newVote);
		questionRepository.save(question);
	}
}
