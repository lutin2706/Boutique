# Boutique
Boutique en ligne - Servlets

Projet de base dans le cadre du cours sur les Servlets. 
## Structure

* WebContent/WEB-INF/web.xml définit le mapping entre les URL et les servlets
* WebContent contient les éléments nécessaires à la vue (images, css, ...)
* WebContent/WEB-INF contient ce qui est nécessaire à la vue, mais caché à l'utilisateur (les différentes jsp + les libs)

Trois Servlets ont été définies :
* ProductServlet retrouve la liste des produits et l'envoie à la JSP products.jsp
* DetailServlet affiche les détails d'un produit (via details.jsp)
* CartServlet gère le panier du client et renvoie vers la page Products.  
GET affiche le panier  
POST ajoute un article au panier, ou le vide, selon le paramètre passé

## Technologies utilisées

* JEE (servlets + JSP)
* Pas d'accès à la DB (produits stockés dans une Liste)
* HTML/CSS

## Commencer un nouveau projet
* File > New > Dynamic Web Project
* Target runtime : Tomcat (retrouver celui qu'on a téléchargé précédemment)
* Context root : l'URL root pour accéder à l'application (ex: localhost:8080/contextroot)
* Content Directory : le folder où on stockera les fichiers web (images, jsp, html, ...)
* Dans Tomcat, définir au moins un user dans conf/tomcat-users.xml
* Mapping des URL dans WebContent/WEB-INF/web.xml

En créant une Servlet, on a le choix des méthodes à implémenter
* init + destroy : appelés à l'initialisation et à la destruction de la Servlet
* service : appelé pour toute request
Normalement, on n'utilise pas le constructeur, tout se fait dans le init.

**Pour afficher la page, il faut mettre le projet dans le server (run as > run on server ou clic-droit sur le serveur > Add & remove**  
