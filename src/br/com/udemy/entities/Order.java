package br.com.udemy.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.udemy.enums.OrderStatus;

public class Order {

	// Atributos
	private Date moment;
	private OrderStatus status;	
	private List<OrdemItem> items = new ArrayList<>();
	private Client client;
	
	
	
	// Outros métodos
	public void addItem(OrdemItem item) {
		items.add(item);
	}
	public void removeItem(OrdemItem item) {
		items.remove(item);
	}
	public Double total() {
		Double sumTotal = 0.0;
		for(OrdemItem e: items) {
			sumTotal+= e.subTotal();
		}		
		if(sumTotal > 0) {
			return sumTotal;
		}
		else {
			JOptionPane.showInternalMessageDialog(null, "Não há valor para esse pedido");
			return 0.0;
		}		
	}
	
	// Construtores
	
	public Order() {}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	// Metodos Getteres and Setteres
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	// Métodos Getteres and Setteres
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	// Método toString
	public String toString() {
		return "Ordem Resumida: \nData do Pedido: " + this.moment + "\nStatus do Pedido: " + this.status +
				"\nCliente: " + this.client.getName() + " Data de Nascimento: " + this.client.getBirthDate() + 
				" - E-mail: " + this.client.getEmail() + "\n Itens no Pedido: " + this.items.toString() + 
				"\n\n Total Geral: R$" + this.total();
	}
	
	
}
