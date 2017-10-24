<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Votre panier</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<c:import url="navigation.jsp" />
	<section>
		<h1>Votre panier</h1>
		<table>
			<c:forEach var="ligne" items="${panier.items}">
				<input type="hidden" name="id" value="${produit.id }" />
				<tr>
					<td><a href="details?id=${ligne.produit.id}"><img
							alt="${ligne.produit.nom }" src="${ligne.produit.imageURL }"></a></td>
					<td>${ligne.produit.nom}</br> <f:formatNumber pattern="# ##0.00 ¤"
							value="${ligne.produit.prix/100 }" type="currency" currencySymbol="€" /></td>
					<td>Quantité: ${ligne.quantite }</td>
				</tr>
			</c:forEach>
		</table>
		<p>TOTAL: <f:formatNumber pattern="# ##0.00 ¤"
							value="${panier.montantTotal/100 }" type="currency" currencySymbol="€" /></p>
		<form method="post" action="cart">
			<input type="hidden" name="action" value="empty" /> <input
				type="submit" value="Vider mon panier" />
		</form>
	</section>
</body>
</html>


