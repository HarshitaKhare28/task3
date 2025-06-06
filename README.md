# 📝 Task 3 - Spring Boot + Hibernate CRUD with Oracle DB

This project is a demonstration of performing **CRUD operations** using **Spring Boot**, **Hibernate (JPA)**, and **Oracle Database**. It is part of the Task 3 assignment and showcases how to integrate Oracle with a Java backend using standard enterprise technologies.

---

## 🚀 Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **Oracle Database**
- **Maven**
- **Postman** (for API testing)

---

## 📦 Features

- Add a new record to the database
- View all records or a specific record by ID
- Update an existing record
- Delete a record by ID
- Well-structured layered architecture (Controller, Service, Repository, Model)
- RESTful API implementation

---

## 📁 Project Structure

```
task3/
├── src/
│ ├── main/
│ │ ├── java/com/example/task3/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── Task3Application.java
│ │ └── resources/
│ │ └── application.properties
├── pom.xml

```
---

## 🔌 Configuration (`application.properties`)

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_oracle_username
spring.datasource.password=your_oracle_password
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle10gDialect
server.port=8080
```
Replace your_oracle_username and your_oracle_password with your actual Oracle DB credentials.
