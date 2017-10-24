package be.superteam.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.superteam.model.Cart;
import be.superteam.model.CartItem;
import be.superteam.model.ProductList;

public class CartServlet extends HttpServlet {

	private static final long serialVersionUID = 4082618626677725836L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		
		Cart panier = (Cart) (request.getSession().getAttribute("panier"));

		if (panier == null)
			panier = new Cart();

		if (request.getParameter("action").equals("add")) {
			int qte = Integer.valueOf(request.getParameter("qte"));
			int productId = Integer.valueOf(request.getParameter("id"));
			
			CartItem item = new CartItem(ProductList.getInstance().getProduct(productId), qte);
			panier.addOrUpdateItem(item);
			
		} else if (request.getParameter("action").equals("empty")){
			System.out.println("\tOn vide le panier");
			panier.vider();
		}
		System.out.println(panier.toString());
		
		request.getSession().setAttribute("panier", panier);
		response.sendRedirect("products");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		System.out.println("\tAffichage du contenu du panier");

		request.getRequestDispatcher("WEB-INF/cart.jsp").forward(request, response);
	}



}
