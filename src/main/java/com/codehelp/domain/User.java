package com.codehelp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, precision=19)
	private long id;
	
	@Column(name="nom", nullable=false, length=255)
	private String nom;
	
	@Column(name="prenom", nullable=false, length=255)
	private String prenom;
	
	@Column(name="email", nullable=false, length=255)
	private String email;
	
	@Column(name="rating")
	private long rating;
	
	@Column(name="participation")
	private long participation;

	public User() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getRating() {
		return rating;
	}

	public void setRating(long rating) {
		this.rating = rating;
	}

	public long getParticipation() {
		return participation;
	}

	public void setParticipation(long participation) {
		this.participation = participation;
	}
	
	
	
	

	

}
