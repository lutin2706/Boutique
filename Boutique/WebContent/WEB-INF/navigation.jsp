<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
	<p>Boutique de la Fée Main</p>
</header>
<nav>
	<ul>
		<li><a href="index.html">Accueil</a></li>
		<li><a href="products">Produits</a></li>
		<li><a href="cart">Panier (${panier.nombreArticles })</a></li>
	</ul>
</nav>