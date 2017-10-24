<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des produits de ma boutique</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<c:import url="navigation.jsp" />
	<section>
		<h1>Liste des produits</h1>
		<table>
			<c:forEach var="product" items="${productList}">
				<tr>
					<td><a href="details?id=${product.id}"> <img
							alt="${product.nom }" src="${product.imageURL }"></a></td>
					<td>${product.nom}<br /> <f:formatNumber pattern="# ##0.00 ¤"
							value="${product.prix/100 }" type="currency" currencySymbol="€" /><br/>
							<a href="details?id=${product.id}">Voir le détail</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<p>Vous avez ${panier.nombreArticles } articles dans votre panier</p>

		<p>
			<a href="cart">Voir votre panier</a>
		</p>
	</section>
</body>
</html>