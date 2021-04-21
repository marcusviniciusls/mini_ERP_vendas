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
	
	// Outros m�todos
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
			JOptionPane.showInternalMessageDialog(null, "N�o h� valor para esse pedido");
			return 0.0;
		}
		
	}
	
	// Construtores
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	public Order() {}
	
	// M�todos Getteres and Setteres
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
	
	
	
	
}
