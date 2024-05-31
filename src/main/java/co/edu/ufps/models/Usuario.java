package co.edu.ufps.models;

import java.util.Date;

import lombok.Data;

@Data
public class Usuario {
	
	private String username;
	private String name;
	private String email;
	private Date dateCreated;
	private String state;
	
	public Usuario(String username, String name, String email, Date dateCreated, String state) {
		this.username = username;
		this.name = name;
		this.email = email;
		this.dateCreated = dateCreated;
		this.state = state;
		
	}
}
