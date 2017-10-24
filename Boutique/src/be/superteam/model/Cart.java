package be.superteam.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<CartItem> panier = new ArrayList<>();
	
	public List<CartItem> getItems() {
		return panier;
	}
	
	public void addOrUpdateItem(CartItem item) {
		System.out.println("\tAjout du produit " + item.getProduit().getNom() + 
				" (quantité " + item.getQuantite() + ") dans le panier");
		
		if (panier.contains(item)) {
			CartItem oldItem = panier.get(panier.indexOf(item));
			oldItem.setQuantite(oldItem.getQuantite()+item.getQuantite());
	} else
		panier.add(item);
	}
	
	public int getNombreArticles() {
		int nbr = 0;
		for (CartItem cartItem : panier) {
			nbr += cartItem.getQuantite();
		}
		return nbr;
	}
	
	public int getMontantTotal() {
		int montant=0;
		for (CartItem cartItem : panier) {
			montant += cartItem.getQuantite() * cartItem.getProduit().getPrix();
		}
		return montant;
	}

	public void vider() {
		panier.clear();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\n\tContenu du panier:");

		for (CartItem ligne : panier) {
			sb.append(
					"\tProduit :" + ligne.getProduit().getNom() + " (Quantité :" + ligne.getQuantite() + ")");
		}

		return "Cart []";
	}
	
	
}
