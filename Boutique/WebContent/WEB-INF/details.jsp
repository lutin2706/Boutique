<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Détails du produit ${product.nom }</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<c:import url="navigation.jsp" />
	<section>
		<h1>${product.nom }</h1>
		<p>
			<img alt="${product.nom }" src="${product.imageURL }">
		</p>
		<p>${product.nom}</br>
			<f:formatNumber pattern="# ##0.00 ¤" value="${product.prix/100 }"
				type="currency" currencySymbol="€" />
		</p>
		<form method="post" action="cart">
			<input type="hidden" name="id" value="${product.id }" /> <input
				type="hidden" name="action" value="add" /> <input type="number"
				name="qte" placeholder="Quantité" value="1" /> <input type="submit"
				value="Commander" />
		</form>
	</section>
</body>
</html>