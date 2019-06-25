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
	@Autowired
    private UserService userService;

	public void addReponse(Reponse reponse) {
		reponse.setRating(0);
		userService.incrementParticipation(reponse.getUser().getUserId());
		reponseRepository.save(reponse);
	}

	public Reponse findReponse(long id) {
		return this.reponseRepository.getOne(id);

	}

	public List<Reponse> findAll() {
		return this.reponseRepository.findAll();

	}

	public void deleteReponse(long id) {
		reponseRepository.deleteById(id);

	}

	public Reponse updateReponse(Reponse reponse) {
		return this.reponseRepository.save(reponse);

	}

	public List<Reponse> findReponsesByQuestionId(long questionId) {
		return this.reponseRepository.findReponsesByQuestionId(questionId);

	}
	
	public void ratingReponse(long reponseId, int rating) {
		Reponse reponse= reponseRepository.getOne(reponseId);
		int oldRating=reponse.getRating();
		int newRating=oldRating+rating;
		reponse.setRating(newRating);
		reponseRepository.save(reponse);
	}

}
