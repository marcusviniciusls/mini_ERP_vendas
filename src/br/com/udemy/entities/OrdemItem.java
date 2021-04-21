package br.com.udemy.entities;

public class OrdemItem {

	// Atributos
	private Integer quatity;
	private Double price;
	private Product product;
	
	// Outros métodos
	public Double subTotal() {
		return this.quatity * this.price;
	}
	
	// Metodos Getteres e Setteres
	public Integer getQuatity() {
		return quatity;
	}
	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	// Contrutores
	public OrdemItem(Integer quatity, Double price, Product product) {
		this.quatity = quatity;
		this.price = price;
		this.product = product;
	}
	public OrdemItem() {}
	
	
	// Método toString	
	public String toString() {
		return "\nNome do Produto: " + this.getProduct().getNome() + "\nQuantidade: " + this.quatity + "\nValor Unitário: " +
				this.price + "\nSub-Total R$ " + this.subTotal();
	}
	
}
