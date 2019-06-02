package com.codehelp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false, precision = 19)
	private long id;

	@Column(name = "titre", nullable = false, length = 255)
	private String titre;

	@Column(name = "description", nullable = false, length = 255)
	private String description;

	@Column(name = "tags", nullable = false, length = 255)
	private String tags;

	@Column(name = "resolu", nullable = false, length = 255)
	private boolean resolu;

	public Question() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}
