# 🏨Hotel Booking Platform

## Hotel Booking Platform - RESTful API

This project is a comprehensive RESTful API for a hotel booking platform, built with a modern Java technology stack. It is designed to handle core functionalities, including room management, secure user authentication, booking processing, customer email notification, and online payments.

##  Tech Stack

### Core Technologies

-   **Language**: **Java 21** ( Java OOP, Collections, and Leveraging modern features such as Lambda, Optional, etc.)
-   **Framework**: **Spring Boot 3.x**
-   **Build Tool**: **Apache Maven**

### Data Persistence

-   **Data Access**: **Spring Data JPA** for simplified repository layer implementation.
-   **Database**: **MySQL** as the relational database.
-   **ORM**: **Hibernate** as the underlying JPA provider.

### Security

-   **Framework**: **Spring Security 6.x** for handling authentication and authorization.
-   **Authentication**: **JSON Web Tokens (JWT)** for stateless, token-based authentication.

### Key Libraries & Features

-   **Code Efficiency**: **Project Lombok** to reduce boilerplate code (e.g., getters, setters, constructors, Slf4j).
-   **Validation**: **Jakarta Bean Validation** for server-side validation of request data.
-   **Email Notifications**: **Spring Mail** for sending transactional emails (e.g., booking confirmations, payment receipts).
-   **Payment Processing**: **Stripe API** for securely handling online credit card payments.

## How to install the project

    git clone https://github.com/Piyapat-Thongrueng/hotelBooking-Backend.git

## Database Setup

-   Open your Relational Database such as MySQL Workbench or DBeaver.
- Create a new database schema for this project.

        CREATE DATABASE hotel_booking_db;

## Spring Boot project setup


    server.port=9090
    
    # MYSQL CONNECTION
    spring.datasource.url=jdbc:mysql://localhost:3306/hotel_booking_db
    spring.datasource.username= your-mysql-username
    spring.datasource.password= your-mysql-password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    secreteJwtString = your-very-long-and-secret-jwt-string-that-no-one-knows
    
    # STRIPE CONFIGURATION
    stripe.api.secret.key=sk_test_your_stripe_secret_key_here
    
    # EMAIL CONFIGURATION
    spring.mail.host=smtp.gmail.com spring.mail.port=587
    spring.mail.username=your-email@gmail.com 
    spring.mail.password=your-google-app-password
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=true

## Build and Run the project

Open Terminal in IDE and run command Maven in order to download all relevant dependencies and run the project.


    mvn clean install
    mvn spring-boot:run


      


    
    

