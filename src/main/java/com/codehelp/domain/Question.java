package com.codehelp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Question")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="native")
	@Column(unique = true,name="questionId", nullable = false, precision = 19)
	private long questionId;

	@Column(name = "titre", nullable = false, length = 255)
	private String titre;

	@Column(name = "description", nullable = false, length = 255)
	private String description;

	@Column(name = "tags", nullable = false, length = 255)
	private String tags;

	@Column(name = "resolu", nullable = false, length = 255)
	private boolean resolu;
	
	@Column(name= "vote",nullable =false)
	private long vote;
	
	@ManyToOne
    @JoinColumn(name="user_id",nullable=false)
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Reponse> reponses= new ArrayList<>();
	

	public Question() {

	}

	
	
	public long getQuestionId() {
		return questionId;
	}



	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public boolean isResolu() {
		return resolu;
	}

	public void setResolu(boolean resolu) {
		this.resolu = resolu;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public long getVote() {
		return vote;
	}



	public void setVote(long vote) {
		this.vote = vote;
	}
	
	
	
	

}
