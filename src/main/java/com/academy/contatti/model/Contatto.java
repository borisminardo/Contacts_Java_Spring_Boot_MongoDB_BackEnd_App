package com.academy.contatti.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="contatto")
public class Contatto implements Serializable {
	private static final long serialVersionUID = 7649425020860442196L;
	
	@Id
	private String id;
	private String nome; 
	private String cognome; 
	private String username;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
