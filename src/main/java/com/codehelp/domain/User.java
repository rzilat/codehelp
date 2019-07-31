package com.codehelp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "User")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="native")
	@Column( unique = true, nullable = false, precision = 19)
	private long userId;

	@Column(name = "nom", nullable = false, length = 255)
	private String nom;

	@Column(name = "prenom", nullable = false, length = 255)
	private String prenom;

	@Column(name = "email", nullable = false, length = 255)
	private String email;

	@Column(name = "rating")
	private long rating;

	@Column(name = "participation")
	private long participation;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Question> questions= new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Reponse> reponses= new ArrayList<>();

	public User() {

	}
	
	

	public User(String nom, String prenom, String email, long rating, long participation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.rating = rating;
		this.participation = participation;
	}



	

	public User(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}



	public long getUserId() {
		return userId;
	}



	public void setUserId(long userId) {
		this.userId = userId;
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
