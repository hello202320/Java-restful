
---

# Swagger Demo API

Spring Boot REST API with MongoDB integration and Swagger UI for interactive API docs.

---

## Features

* **CRUD operations** for User entity (\_id, name, email, password)
* MongoDB as the data store
* Clean REST endpoints with Spring Web
* Swagger UI for live API documentation & testing
* Environment config support with `.env` for Mongo URI
* Easy to extend and customize

---

## Tech Stack

* Java 17+
* Spring Boot 3.x
* Spring Data MongoDB
* Swagger/OpenAPI 3.0
* Maven (or mvnd)

---

## Getting Started

### Prerequisites

* Java 17 or higher installed
* MongoDB running locally or remotely
* Maven or `mvnd` installed
* `.env` file in project root with:

```env
MONGO_URI=mongodb://username:password@host:port/
MONGO_DB=database_name
```

---

### Running the Project

```bash
./mvn spring-boot:run
# or if you use mvnd:
mvnd spring-boot:run
```

---

### API Endpoints

| Method | Endpoint    | Description        |
| ------ | ----------- | ------------------ |
| GET    | /users      | Get all users      |
| POST   | /users      | Create a new user  |
| GET    | /users/{id} | Get user by ID     |
| PUT    | /users/{id} | Update user's name |
| DELETE | /users/{id} | Delete user by ID  |

---

### Swagger UI

Visit `http://<host>/swagger-ui/index.html` to explore and test the API interactively.

---

### Sample User JSON

```json
{
  "name": "John Smith",
  "email": "john@email.com",
  "password": "password"
}
```

---

## Notes

* Only the `name` field updates in the PUT method; extend as needed.
* Error handling is basic; consider adding global exception handlers.

---

## License

MIT © hello203020

---


