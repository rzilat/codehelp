package com.codehelp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Reponse")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Reponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="native")
	@Column(unique = true, nullable = false, precision = 19)
	private long reponseId;
	
	@Column(name = "reponse", nullable = false, length = 255)
	private String reponse;
	
	@Column(name = "rating", nullable = false)
	private int rating;
	
	@ManyToOne
    @JoinColumn(name="user_id",nullable=false)
	private User user;
	
	@ManyToOne
    @JoinColumn(name="questionId",nullable=false)
	private Question question;

	public Reponse() {
		
	}

	

	public long getReponseId() {
		return reponseId;
	}



	public void setReponseId(long reponseId) {
		this.reponseId = reponseId;
	}



	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Question getQuestion() {
		return question;
	}



	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
