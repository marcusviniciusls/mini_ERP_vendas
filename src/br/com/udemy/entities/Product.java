package br.com.udemy.entities;

public class Product {

	// Atributos
	private String nome;
	private double price;
	
	// contrutores
	public Product(String nome, double price) {
		this.nome = nome;
		this.price = price;
	}
	public Product() {}
	
	// Métodos Getteres e Setteres
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
