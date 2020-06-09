package application;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Product prod = new Product("TV", 200.0);
		
		System.out.println(prod.priceTag());
		
	}

}
