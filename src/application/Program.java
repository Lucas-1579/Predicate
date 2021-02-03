package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitie.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		
		products.add(new Product("TV", 500.00));
		products.add(new Product("CellPhone", 1000.00));
		products.add(new Product("Mouse", 60.00));
		products.add(new Product("KeyBoard", 90.00));
		
		products.removeIf(new ProductPredicate());
		
		products.forEach(pr -> System.out.println(pr));
	}

}
