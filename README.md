# Borcelle Product Service

This repository contains the **Product Service** for the e-commerce platform, built using Spring Boot. It provides product-related functionalities, such as managing product data and querying product details. The service integrates with MongoDB for data persistence, Eureka for service discovery, and gRPC for inter-service communication.


## Overview

The **Product Service** is a microservice responsible for managing product data in the e-commerce platform. It provides RESTful APIs for CRUD operations and uses gRPC for efficient communication with other services.

---

## Features

- **CRUD Operations**: Create, read, update, and delete products.
- **gRPC Communication**: Enable efficient inter-service communication.
- **MongoDB Integration**: Persistent storage for product data.
- **Eureka Client**: Registers with Eureka Server for service discovery.
- **Scalability**: Designed to handle a large number of product queries and updates.

---

## Technologies

- **Spring Boot** - Framework for building Java-based microservices.
- **MongoDB** - NoSQL database for storing product data.
- **Eureka Client** - Registers the service with Eureka Server for service discovery.
- **gRPC** - High-performance RPC framework for communication.
- **Spring Data MongoDB** - Simplifies MongoDB operations with Spring Boot.
- **Maven** - Build tool for managing dependencies and building the application.

---

## Setup

### Prerequisites

Before you begin, ensure that you have the following installed:

- Java 21
- Maven

### Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/akram-idrissi/borcelle-product-service.git
   cd borcelle-product-service
   ```
2. mvn clean install
3. mvn spring-boot:run
4. open browser got to: http://localhost:8090
