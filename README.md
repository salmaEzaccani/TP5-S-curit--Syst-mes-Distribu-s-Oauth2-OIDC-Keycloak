# Salma EZACCANI master SDIA 2

#  Sécurité des systèmes distribués Oauth2 OIDC Keycloak

## Partie 1 : Configuration de Keycloak

### Étapes pour configurer Keycloak :

**Démarrer Keycloak**
    - Commande pour démarrer Keycloak 
      ```bash
       docker run -p 8080:8080 -e KC_BOOTSTRAP_ADMIN_USERNAME=admin -e KC_BOOTSTRAP_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:26.0.7 start-dev
      ```


**Accédez à http://localhost:8080**
    -<img src="captures/img_1.png">

**Créer une Realm realm-sdia**
 
      <img src="captures/img_2.png">

**Créer un client ecom-client-ang**
<img src="captures/client.png">


**Créer des utilisateurs**
<img src="captures/users.png">


** Affectez ces rôles aux utilisateurs.**
    - Exemple de rôles : `ADMIN`, `USER`.
   
<img src="captures/roles.png">
---

## Exécution des tests avec Postman

### Tester l'authentification avec les JWT


<img src="captures/test postman 4.png">
<img src="captures/test postman 3.png">
<img src="captures/test postman 1.png">
<img src="captures/test postman 2.png">

<img src="captures/test client id.png">


---

## Partie 2 : Développement et sécurisation de l'architecture Micro-Service

    - Configurez un serveur Spring Boot avec sécurité Keycloak.
<img src="captures/sec back.png">   

2. **Frontend : Angular**
    - Implémentez l'authentification via Keycloak dans Angular.
    - Utilisez la bibliothèque **keycloak-js** pour intégrer Keycloak.

<img src="captures/img_3.png">



<img src="captures/img_4.png">

**Orders :**
**H2 Database :**
<img src="captures/1V2.png">



**Orders interface :**

<img src="captures/img_5.png">

**Order Details :**
<img src="captures/img_6.png">




