package br.com.udemy.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Atributos
	private String name;
	private String email;
	private Date birthDate;
	
	// Contrutores
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	public Client() {}
	
	// Métodos Getteres e Setteres
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}	
	
	// Método toString
	public String toString() {
		return "Cliente: " + this.name + "\nE-Mail: " + this.email + "\nData de Nascimento: " +
				sdf.format(this.birthDate);
	}
}
