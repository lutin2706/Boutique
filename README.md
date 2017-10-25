# Boutique de matériel de couture

## Objectif
Développer un projet de base dans le cadre du cours sur les servlets.  
Permettre la navigation entre différentes pages et utiliser un formulaire de login.

## Techno utilisées
* Architecture: Model/Servlet/JSP
* Framework: JEE (Dynamic Web Project)
* Front-End : HTML/CSS
* Persistance des données : Aucune (stockage dans une Liste)
* Autres: JSTL (formatNumber, currency, bouclage sur les Maps, ...)

## Structure des packages
### Servlets
Trois Servlets ont été définies :
* ProductServlet retrouve la liste des produits et l'envoie à la JSP products.jsp
* DetailServlet affiche les détails d'un produit (via details.jsp)
* CartServlet gère le panier du client et renvoie vers la page Products.  
GET affiche le panier  
POST ajoute un article au panier, ou le vide, selon le paramètre passé
### WebContent
* WebContent contient les éléments nécessaires à la vue (images, css, ...)
* WebContent/WEB-INF contient ce qui est nécessaire à la vue, mais caché à l'utilisateur (les différentes jsp + les libs)
* WebContent/WEB-INF/web.xml définit le mapping entre les URL et les servlets
### Model
Contient les éléments du modèle à stocker (Product, stocké dans ProductList), et des éléments utilsés par l'application (Cart, CartItem)

## Librairies utilisées
* JSTL-1.2

## Procédure pour refaire le même projet
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
## Comment l'installer/l'utiliser
**Pour afficher la page, il faut mettre le projet dans le server (run as > run on server ou clic-droit sur le serveur > Add & remove)**  
Démarrer le serveur  
Dans le navigateur, entrer http://localhost:8080/Boutique

