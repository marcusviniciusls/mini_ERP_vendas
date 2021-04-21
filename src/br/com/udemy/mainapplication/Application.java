package br.com.udemy.mainapplication;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.udemy.entities.Client;
import br.com.udemy.entities.OrdemItem;
import br.com.udemy.entities.Order;
import br.com.udemy.entities.Product;
import br.com.udemy.enums.OrderStatus;

public class Application {

	public static void main(String[] args) throws HeadlessException, ParseException {
		
		//Entrada dos dados do Cliente
		Client cl1 = new Client();
		
		cl1.setName(JOptionPane.showInputDialog("Digite o Nome do cliente?"));
		cl1.setEmail(JOptionPane.showInputDialog("Digite o E-mail do cliente?"));
		
		// Mexendo com datas
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		cl1.setBirthDate(sdf1.parse(JOptionPane.showInputDialog("Digite a data de Nascimento? DD/MM/YYYY")));
		
		JOptionPane.showMessageDialog(null, "Entrar com dados da Ordem de Vendas");
		Order ord1 = new Order();
		ord1.setMoment(new Date());
		ord1.setClient(cl1);
		OrderStatus status = OrderStatus.valueOf(JOptionPane.showInputDialog("Digite o Status da Ordem?"));
		ord1.setStatus(status);
		
		Integer qtdItens = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Itens que tem essa Ordem?"));
		
		// Pedindo informações para o usuário
		for(int i = 0; i < qtdItens; i++) {
			JOptionPane.showMessageDialog(null, "Produto #"+ (i+1));
			Product p = new Product();
			p.setNome(JOptionPane.showInputDialog("Digite o nome do produto?"));
			p.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto?")));
			OrdemItem or = new OrdemItem();
			or.setProduct(p);
			or.setPrice(p.getPrice());
			or.setQuatity(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Produto?")));
			ord1.addItem(or);			
		}
		
		JOptionPane.showMessageDialog(null, ord1.toString());
	}

}
