A Spring Boot-based  for managing shopping carts, products, and cart items with RESTful APIs.

**Get started →**

` `Documentation: API Endpoints & Examples  Community: Join #shopping-cart on Slack →  Get involved: [GitHub Issues](https://github.com/your-repository/issues)

Quick start

Follow these steps to install and run the Shopping Cart Microservice.

1. Prerequisites

Before you start, you’ll need to have the following tools installed:

- **Java 8 or later**

  ` `[Install Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

- **MySQL Database**

  ` `[Download and Install MySQL](https://dev.mysql.com/downloads/installer/)

- **Maven (Optional)**

  ` `[Install Maven](https://maven.apache.org/install.html)

  ` `*Note: You can use Maven to build the project. If you don't have Maven installed, Spring Boot provides a wrapper to build the project without Maven installed.*

2. Clone the repository

Clone the repository to your local machine:

bash

Copy

git clone https://github.com/your-repository/shopping-cart-microservice.git cd shopping-cart-microservice

3. Set up MySQL Database
1. **Create a MySQL database:**
- Open MySQL Workbench or any other MySQL client and run the following SQL command to create a new database:
- sql
- Copy
- CREATE DATABASE shopping\_cart\_db;
2. **Configure your database connection:**
- In your project directory, navigate to src/main/resources/application.properties and configure your MySQL database connection:
3. properties
3. Copy
3. spring.datasource.url=jdbc:mysql://localhost:3306/shopping\_cart\_db
6. spring.datasource.username=root
6. spring.datasource.password=your\_password
6. spring.jpa.hibernate.ddl-auto=update
6. spring.jpa.show-sql=true
6. spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
6. Replace your\_password with the password for your MySQL database.

4\. Run the Application

1. **Using Maven Wrapper (if Maven is not installed)**
1. The project includes a Maven wrapper, which means you don’t need to install Maven separately. You can run the project using the following command:
1. bash
1. Copy
1. ./mvnw spring-boot:run
1. On Windows, you can use mvnw.cmd:
1. bash
1. Copy
1. mvnw.cmd spring-boot:run
1. **Using Maven (if Maven is installed)**
1. If you have Maven installed, you can run the project with the following command:
1. bash
1. Copy
1. mvn spring-boot:run
5. Access the Application

Once the application is running, you can access it at http://localhost:8080.

6. Postman Collection

To test the API, you can import the Postman Collection. This collection provides pre-built API requests to interact with the Shopping Cart microservice.

API Endpoints

- **Add Product**: POST /api/products
- **Get All Products**: GET /api/products
- **Add to Cart**: POST /api/cart
- **Get Cart Items**: GET /api/cart
- **Update Cart Item**: PUT /api/cart/{itemId}
- **Remove Cart Item**: DELETE /api/cart/{itemId}
- **Clear Cart**: DELETE /api/cart
- **Update Product**: PUT /api/products/{productId}
- **Remove Product from Cart**: DELETE /api/cart/product/{productId}

Advanced Configuration

The Shopping Cart service allows you to:

- Manage products and cart items with custom endpoints.
- Perform CRUD operations on products and cart items.
- Customize your MySQL database connection.

**Detailed Configuration Guide →**

Technologies Used

- **Spring Boot** (Java)
- **MySQL Database**
- **Postman** (for API testing)

Developing

**Prerequisites:**

- **Java 8 or later**

  ` `[Install Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

- **MySQL Database**

  ` `[Install MySQL](https://dev.mysql.com/downloads/installer/)

- **Maven** (Optional)

  ` `[Install Maven](https://maven.apache.org/install.html)

1. Clone the repository:
1. bash
1. Copy
1. git clone https://github.com/your-repository/shopping-cart-microservice.git
1. Navigate to the project directory:
1. bash
1. Copy
1. cd shopping-cart-microservice
1. Build and run the application:
1. bash
1. Copy
1. ./mvnw spring-boot:run

Further reading

- [Writing REST APIs with Spring Boot](https://spring.io/guides/tutorials/rest/)
  - Spring Boot JPA for database operations
  - Setting up MySQL in Spring Boot

Open Source & Contributing

This project is open source and available under the MIT license. We welcome contributions to improve and extend the functionality.

- Fork the repository and create a pull request.
- Check out the open issues on GitHub: [Issues](https://github.com/your-repository/issues)

Get Involved

Join #shopping-cart on Slack →

Want to help but don't know where to start? Pick up one of the help wanted issues:

- [Open Issues](https://github.com/your-repository/issues)
