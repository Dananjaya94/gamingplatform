# Gaming Platform Backend

This project is the backend for a gaming platform application, built using Spring Boot. It provides RESTful APIs for managing users and games, with features like data persistence, web handling, and security.

## Technologies Used

*   **Java**: 17
*   **Spring Boot**: 3.3.1
*   **Spring Data JPA**: For data persistence.
*   **Spring Web**: For building RESTful APIs.
*   **Spring Security**: For authentication and authorization (including JWT).
*   **PostgreSQL**: Relational database.
*   **Lombok**: To reduce boilerplate code.
*   **JJWT**: JSON Web Token implementation for security.
*   **Springdoc OpenAPI UI**: For API documentation and testing.
    *   *Note: The project currently includes both `springdoc-openapi-starter-webmvc-ui` and `springfox-swagger-ui`. It is recommended to use `springdoc-openapi` for Spring Boot 3+ projects. If you encounter issues, consider removing `springfox-swagger-ui` from `pom.xml`.*

## Project Structure

The project follows a standard Spring Boot application structure:

*   `com.gaming.gamingplatform.controller`: Handles incoming HTTP requests and defines API endpoints.
*   `com.gaming.gamingplatform.service`: Contains the business logic and orchestrates operations.
*   `com.gaming.gamingplatform.repository`: Provides data access layer for interacting with the database.
*   `com.gaming.gamingplatform.dto`: Data Transfer Objects used for request and response bodies.
*   `com.gaming.gamingplatform.security`: Configuration for Spring Security, including JWT authentication.
*   `com.gaming.gamingplatform.config`: General application configurations.

## Getting Started

### Prerequisites

*   Java 17
*   Maven
*   PostgreSQL database

### Database Setup

1.  Ensure you have a PostgreSQL server running.
2.  Create a database named `gamingPlatform`.
3.  Update the database connection details in `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/gamingPlatform
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```
    *(Note: The current configuration uses `username=vihangan` and `password=vihangan`)*

### Running the Application

1.  **Build the project using Maven:**
    ```bash
    mvn clean install
    ```
2.  **Run the Spring Boot application:**
    ```bash
    mvn spring-boot:run
    ```
    Alternatively, you can run the `GamingplatformApplication.java` file directly from your IDE.

The application will start on `http://localhost:8080` by default.

## API Documentation

The API documentation is available via Swagger UI. Once the application is running, you can access it at:
*   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) (for Springfox)
*   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) (for Springdoc OpenAPI)

## Database Schema (Entities)

The main entities in the application are `User` and `Game`.

### User
*   `id`: Unique identifier for the user.
*   `username`: User's unique username.
*   `email`: User's email address.

### Game
*   `id`: Unique identifier for the game.
*   `name`: Name of the game.
*   `description`: Description of the game.

## Frontend Project

This backend project is designed to work with the following frontend application:
[https://github.com/Dananjaya94/gaming-platform-frontend.git](https://github.com/Dananjaya94/gaming-platform-frontend.git)