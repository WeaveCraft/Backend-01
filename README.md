# HolistiQ Backend

HolistiQ is a **personal family hub application** designed to manage finances, shopping, household, health, recipes, and calendar events for your family.  
This repository contains the **Spring Boot backend** of the HolistiQ application. It uses **PostgreSQL** as the database and exposes REST APIs for future frontend and mobile applications.

---

## Table of Contents
 
- Features  
- Technologies  
- Getting Started   
- Database   
- Project Structure   
- Contributing  
- License  

---

## Features

- User management (authentication, roles, permissions)  
- Household and family management  
- Finance tracking (accounts, transactions, budgets)  
- Shopping list and product management  
- Modular and scalable architecture for future domains (health, recipes, notifications, analytics)  
- Designed for local home hosting and secure family use  

---

## Technologies

- Java 25  
- Spring Boot 4.0.1  
- Spring Data JPA (Hibernate)  
- PostgreSQL  
- Maven  
- Lombok (optional)

# Dependencies

- Spring Web (WEB)
- Spring Data JPA (SQL)
- PostgreSQL Driver (SQL)
- Spring Security (SECURITY)
- Lombok (DEVELOPER TOOLS)

---

## Getting Started

### Prerequisites

- Java 25  
- Maven  
- PostgreSQL installed locally  

### Clone the repository

git clone https://github.com/ViktorHurtig/HolistiQ-Backend.git  
cd holistiq-core

### Configure the database

Edit `src/main/resources/application.properties` and set your database credentials:

spring.datasource.url=jdbc:postgresql://localhost:5432/holistiq_test  
spring.datasource.username=holistiq_user  
spring.datasource.password=yourpassword  
spring.jpa.hibernate.ddl-auto=update

> Using a test database ensures you can safely develop without affecting real data.

### Run the application

mvn spring-boot:run  

The backend will start on http://localhost:8080

---

## Database

The backend uses PostgreSQL with the following **core tables**:

- `users`, `roles`, `user_roles` → identity & access  
- `household`, `household_members` → family management  
- `account`, `transaction`, `budget` → finance domain  
- `product`, `shopping_list`, `shopping_list_item` → shopping domain  

---

## Project Structure

holistiQ  
 ├─ HolistiQApplication.java  
 ├─ config/        ← security, CORS, database configs  
 ├─ auth/          ← login, JWT tokens  
 ├─ user/          ← Users & Roles  
 ├─ family/        ← Household & Members  
 ├─ finance/       ← Accounts, Transactions, Budget  
 ├─ shopping/      ← Products, Shopping Lists  
 └─ common/        ← Utilities, constants, helpers  

> Each domain has its own package with **entities, repositories, and services**.

---

## Contributing

1. Fork the repository  
2. Create a new branch (`git checkout -b feature/your-feature`)  
3. Commit your changes (`git commit -m "Add feature"`)  
4. Push to your branch (`git push origin feature/your-feature`)  
5. Create a Pull Request  

---

## License

This project is for **personal family use only**.  
Not intended for commercial use or redistribution.

##
Shortcuts
wip (Work In Progress)
