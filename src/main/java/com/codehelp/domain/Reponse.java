package com.codehelp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "rating", nullable = false, length = 255)
	private long rating;

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



	public long getRating() {
		return rating;
	}



	public void setRating(long rating) {
		this.rating = rating;
	}

	
	
	
	
	
	
	
	
	
	
}
