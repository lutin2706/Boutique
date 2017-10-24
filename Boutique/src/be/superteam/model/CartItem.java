package be.superteam.model;

public class CartItem {

	private Product produit;
	private int quantite;
	
	public CartItem() {
	}

	public CartItem(Product produit, int quantite) {
		super();
		this.produit = produit;
		this.quantite = quantite;
	}

	public Product getProduit() {
		return produit;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + produit.getId();
//		result = prime * result + quantite;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (produit.getId() != other.produit.getId())
			return false;
		
		return true;
	}
	
	
}
