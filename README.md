# boutique
Boutique en ligne - Servlets

Projet de base dans le cadre du cours sur les Servlets. Projet Eclipse : Dynamic Web Project

## Structure

* WebContent/WEB-INF/web.xml définit le mapping entre les URL et les servlets
* WebContent contient les éléments nécessaires à la vue (images, css, ...)
* WebContent/WEB-INF contient ce qui est nécessaire à la vue, mais caché à l'utilisateur (les différentes jsp + les libs)

Trois Servlets ont été définies :
* ProductServlet retrouve la liste des produits et l'envoie à la JSP products.jsp
* DetailServlet affiche les détails d'un produit (via details.jsp)
* CartServlet gère le panier du client et renvoie vers la page Products.
** GET affiche le panier
** POST ajoute un article au panier, ou le vide, selon le paramètre passé

## Technologies utilisées

* JEE (servlets + JSP)
* Pas d'accès à la DB (produits stockés dans une Liste)
