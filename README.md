# User Management System (Spring Boot & JPA)

A full-stack user management web application built with **Java 21** and **Spring Boot**, implementing core CRUD (Create, Read, Delete) operations using **Spring Data JPA**, an in-memory **H2 Database**, and dynamic **Thymeleaf** templates.

---

## 🚀 Key Features

* **CRUD Capabilities:** Full data lifecycle management to register, list, and delete user records.
* **ORM & Persistence:** Automated database schema mapping and query abstraction powered by Spring Data JPA and Hibernate.
* **In-Memory Storage:** Seamless data storage with integrated H2 Database and console monitoring.
* **Server-Side Rendering:** Dynamic HTML UI templates rendered via Thymeleaf and Spring Web MVC.

---

## 🛠️ Tech Stack

* **Language:** Java 21
* **Framework:** Spring Boot
* **Persistence:** Spring Data JPA / Hibernate
* **Database:** H2 Database Engine
* **View Layer:** Thymeleaf / Spring Web MVC
* **Build Tool:** Maven

---

## 📂 Project Structure

```text
src/main/
├── java/
│   ├── User.java               # JPA Entity representing user records
│   ├── UserRepository.java     # Spring Data JPA interface for data operations
│   └── MyController.java       # Request routing and UI controller logic
└── resources/
    ├── templates/              # Thymeleaf dynamic HTML views
    └── application.properties  # Database connection and server configurations
⚙️ Local Setup
Clone the repository:

Bash
git clone [https://github.com/linasaglam/spring-boot-user-management.git](https://github.com/linasaglam/spring-boot-user-management.git)
Run with Maven:

Bash
./mvnw spring-boot:run
(On Windows: mvnw.cmd spring-boot:run)

Access Application:

Web App: http://localhost:8080

H2 Console: http://localhost:8080/h2-console
