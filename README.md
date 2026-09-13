# Insurance Policy and Claim Management System

A backend REST API application developed using **Java and Spring Boot** to manage customers, insurance policies, policy purchases, premium payments, and insurance claims.

The application follows a **layered architecture** using Controller, Service, Repository, and Model layers, with **MySQL** as the database and **Spring Data JPA/Hibernate** for database operations.

---

## 📌 Project Overview

The Insurance Policy and Claim Management System is a small insurance-domain Proof of Concept (POC) designed to demonstrate real-world backend development concepts using Spring Boot.

The system manages the complete basic insurance workflow:

- Customer registration
- Insurance policy management
- Customer policy purchase
- Premium payment
- Policy activation after successful payment
- Claim submission
- Claim validation
- Claim approval or rejection

The main objective of this project is to demonstrate how **REST APIs, business logic, database persistence, and entity relationships** can be implemented in a Spring Boot application.

---

## ✨ Features

### Customer Management
- Register a new customer
- Retrieve all customers
- Retrieve a customer by ID

### Policy Management
- Create insurance policies
- View all available policies
- Retrieve a policy by ID
- Store premium and coverage information

### Customer Policy Management
- Purchase an insurance policy
- Store customer-policy purchase details
- Track policy purchase date
- Maintain policy status
- Activate the policy after successful payment

### Payment Management
- Process premium payments
- Store payment details
- Maintain payment status
- Automatically activate the purchased policy after successful payment

### Claim Management
- Raise an insurance claim
- Maintain claim status
- Validate claims
- Check whether the customer's policy is active
- Check whether the claim amount is within the policy coverage amount
- Approve or reject claims based on validation

---

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java 21 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Web | REST API Development |
| Spring Data JPA | Database Access |
| Hibernate | ORM |
| MySQL | Relational Database |
| Maven | Build and Dependency Management |
| Lombok | Reducing Boilerplate Code |
| Postman | API Testing |
| Eclipse | Development Environment |
| Git & GitHub | Version Control |

---

## 🏗️ Architecture

The application follows a layered architecture:

```text
                    Client
                  (Postman)
                      |
                      v
              +---------------+
              |   Controller  |
              +---------------+
                      |
                      v
              +---------------+
              |    Service    |
              +---------------+
                      |
                      v
              +---------------+
              |  Repository   |
              +---------------+
                      |
                      v
              +---------------+
              |     MySQL     |
              +---------------+
