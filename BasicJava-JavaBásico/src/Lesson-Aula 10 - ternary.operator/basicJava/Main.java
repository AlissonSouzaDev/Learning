package javaBasico;

public class Main {

	public static void main(String[] args) {

		double price = 34.5;
		double discount = (price < 20) ? discount = price * 0.1 : price * 0.05;

		System.out.println(discount);

	}

}