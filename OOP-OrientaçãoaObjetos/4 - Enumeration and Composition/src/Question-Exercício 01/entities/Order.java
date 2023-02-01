package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
	
		this.moment = moment;
		this.status = status;
		this.client = client;
		
	}

	public LocalDateTime getMoment() {
		
		return moment;
		
	}

	public void setMoment(LocalDateTime moment) {
		
		this.moment = moment;
		
	}

	public OrderStatus getStatus() {
		
		return status;
		
	}

	public void setStatus(OrderStatus status) {
		
		this.status = status;
		
	}

	public Client getClient() {
		
		return client;
		
	}

	public void setClient(Client client) {
		
		this.client = client;
		
	}
	
	public void addItem(OrderItem orderItem) {
		
		items.add(orderItem);
		
	}

	public void removeItem(OrderItem orderItem) {
		
		items.remove(orderItem);
		
	}
	
	public Double total() {
		
		double sum = 0.0;
		
		for(OrderItem it : items) {
			
			sum += it.subTotal();
			
		}
		
		return sum;
		
	}
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: ");
		sb.append(fmt.format(moment) + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		
		sb.append("Order items:\n");
		
		for (OrderItem it : items) {
			
			sb.append(it + "\n");
			
		}
		
		sb.append("Total Price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
		
	}
	
}
