package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List <Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products:" + " ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)?" + " ");
			sc.nextLine();
			String productType = sc.nextLine().substring(0);
			
			while (!productType.toLowerCase().equals("c") && !productType.toLowerCase().equals("i") && !productType.toLowerCase().equals("u")) {
				
				System.out.print("Invalid answer, type again:");
				productType = sc.nextLine().substring(0);
				
			}
			
			System.out.print("Name:" + " ");
			String name = sc.nextLine();
			System.out.print("Price:" + " ");
			Double price = sc.nextDouble();
			
			if (productType.toLowerCase().equals("c")) {
				
				list.add(new Product(name, price));
				
			} else if (productType.toLowerCase().equals("i")) {
				
				System.out.print("Customs fee:" + " ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				
			} else {
				
				System.out.print("Manufacture Date (DD/MM/YYYY):" + " ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt);
				list.add(new UsedProduct(name, price, manufactureDate));
				
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product p : list) {
			
			System.out.println(p.priceTag());
			
		}
	
		sc.close();
		
	}

}
