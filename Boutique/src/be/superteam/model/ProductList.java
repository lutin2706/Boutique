package be.superteam.model;

import static java.util.stream.Collectors.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductList {
	private static ProductList instance = null;
	
	private Map<Integer, Product> products;
	
	{
		products = new HashMap<>();
		products.put(1, new Product(1, "Machine à coudre", 34900, "images/machine.jpg"));
		products.put(2, new Product(2, "Ciseaux de couture", 2900, "images/ciseaux.jpg"));
		products.put(3, new Product(3, "Découd-vite", 250, "images/decoudvite.jpg"));
		products.put(4, new Product(4, "Epingles", 350, "images/epingles.jpg"));
		products.put(5, new Product(5, "Fil blanc", 349, "images/filblanc.jpg"));
		products.put(6, new Product(6, "Papier de soie", 650, "images/papiersoie.jpg"));
	}
	
	protected ProductList() {
	}
	
	public static ProductList getInstance() {
		if(instance == null) {
			instance = new ProductList();
		}
		return instance;
	}
	
	public Product getProduct(int id) {
		return products.get(id);
	}

	public List<Product> getProducts() {
		return products.values().stream().collect(toList());
	}
}
