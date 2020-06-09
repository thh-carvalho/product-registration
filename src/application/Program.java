package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Product prod = new Product("TV", 200.0);
		
		System.out.println(prod.priceTag());
		
		Product prod1 = new ImportedProduct("Playstation", 1000.0, 20.0);
		System.out.println(prod1.priceTag());
		
		Date y1 = sdf.parse("08/08/1997");
		Product prod2 = new UsedProduct("Iphone 5", 1500.0, y1);
		System.out.println(prod2.priceTag());
		
	}

}
