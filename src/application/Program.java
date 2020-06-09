package application;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Product prod = new Product("TV", 200.0);
		
		System.out.println(prod.priceTag());
		
		Product prod1 = new ImportedProduct("Playstation", 1000.0, 20.0);
		System.out.println(prod1.priceTag());
		
	}

}
