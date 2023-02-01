package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter client data:");
		System.out.print("Name:" + " ");
		String clientName = sc.nextLine();
		System.out.print("Email:" + " ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):" + " ");
		LocalDate clientBirthDate = LocalDate.parse(sc.next(), fmt1);
		fmt1.format(clientBirthDate);
		Client client = new Client(clientName, clientEmail, clientBirthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status:" + " ");
		sc.nextLine();
		String status = sc.nextLine();
		LocalDateTime moment = LocalDateTime.parse("20/04/2018 11:25:09", fmt2);
		fmt2.format(moment);
		Order order = new Order(moment, OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order?" + " ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name:" + " ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price:" + " ");
			Double productPrice = sc.nextDouble();
			Product product = new Product(productName, productPrice);
			System.out.print("Quantity:" + " ");
			Integer quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, product.getPrice(), product);
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
		
	}

}
