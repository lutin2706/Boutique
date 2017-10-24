package be.superteam.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.superteam.model.Product;
import be.superteam.model.ProductList;

public class DetailServlet extends HttpServlet {

	private static final long serialVersionUID = 2241008849751907764L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entry in:" + getServletName() + " - Method " + request.getMethod());
		Product product = ProductList.getInstance().getProduct(Integer.parseInt(request.getParameter("id")));
		
		System.out.println("\tAffichage des détails du produit " + product);
		request.setAttribute("product", product);
		
		request.getRequestDispatcher("WEB-INF/details.jsp").forward(request, response);
	}


}
