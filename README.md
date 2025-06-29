# API RESTful con Spring Boot y PostgreSQL

Proyecto de ejemplo para operaciones CRUD sobre entidad `Usuario`, conectado a PostgreSQL usando Docker.

## Tecnologías

- Java 17
- Spring Boot 3.2.5
- PostgreSQL (en contenedor Docker)
- Maven
- Postman

## Endpoints principales

| Método | Ruta               | Descripción              |
| ------ | ------------------ | ------------------------ |
| GET    | /api/usuarios      | Lista todos los usuarios |
| GET    | /api/usuarios/{id} | Usuario por ID           |
| POST   | /api/usuarios      | Crea nuevo usuario       |
| PUT    | /api/usuarios/{id} | Actualiza usuario        |
| DELETE | /api/usuarios/{id} | Elimina usuario          |

## Cómo ejecutar

1. Inicia la base de datos:

```bash
docker-compose up -d
Corre la aplicación:
mvn spring-boot:run
```
