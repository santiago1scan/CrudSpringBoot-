
## Descripción

Comics CrudSpringBoot es una aplicación desarrollada en Java utilizando Spring Boot para la gestión de cómics. Permite realizar operaciones de Crear, Leer, Actualizar y Eliminar (CRUD) sobre una base de datos de cómics.

### Tecnologías Utilizadas


Spring Boot 3

Spring Data JPA (Para el acceso a base de datos)

Spring Web (Para la exposición de APIs REST)

H2 Database / SQlite (Dependiendo del entorno de ejecución)

Lombok (Para reducir el boilerplate en las clases)

Swagger (Para documentación de APIs)



# Endpoints Principales

## Endpoints de Compras (BuyController)

POST /api/buy → Crea una nueva compra.

GET /api/buy/{idBuy} → Obtiene una compra por ID.

DELETE /api/buy/comic/{idBuy}/{idComic} → Elimina un cómic de una compra específica.

PUT /api/buy/comic/{idBuy}/{idComic}/{quantity} → Agrega unidades de un cómic a una compra.

## Endpoints de Cómics (ComicController)

POST /api/comic → Crea un nuevo cómic.

GET /api/comic → Lista todos los cómics.

GET /api/comic/{id} → Obtiene un cómic por ID.

PUT /api/comic/{id} → Actualiza un cómic por ID.

DELETE /api/comic/{id} → Elimina un cómic por ID.

Autores:

Julian  David Meneses
Migual Angel Calambas  
Esteban Santiago Escandon 
