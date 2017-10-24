package be.superteam.model;

import java.io.Serializable;

public class Product implements Serializable {


	private static final long serialVersionUID = 7735287292786041043L;
	
	private int id;
	private String nom;
	private int prix;
	private String imageURL;
	
	public Product() {
	}

	public Product(int id, String nom, int prix, String imageURL) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.imageURL = imageURL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nom=" + nom + ", prix=" + prix + ", imageURL=" + imageURL + "]";
	}
}
