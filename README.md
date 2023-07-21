# RESTful E-Commerce API - Spring Boot

```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
:: Spring Boot ::                 (v3.1.1)
```

This is an E-Commerce API project developed using Spring Boot, JPA/Hibernate, Maven, H2, Apache Tomcat, and PostgreSQL. The API allows managing users, orders, products, and categories for an online store.

<img src="https://upload.wikimedia.org/wikipedia/pt/thumb/3/30/Java_programming_language_logo.svg/234px-Java_programming_language_logo.svg.png" alt="Java" width="30">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Jakarta_ee_logo_schooner_color_stacked_default.svg/1200px-Jakarta_ee_logo_schooner_color_stacked_default.svg.png" alt="Rasa" width="50">
<img src="https://spring.io/img/favicon.ico" alt="spring" width="40">
<img src="https://spring.io/img/projects/spring-tool.svg" alt="sts4" width="40">
<img src="https://www.vectorlogo.zone/logos/hibernate/hibernate-icon.svg" alt="Tailwind CSS" width="40">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Apache_Feather_Logo.svg/64px-Apache_Feather_Logo.svg.png" alt="maven" width="22">
<img src="https://www.h2database.com/html/images/h2-logo-2.png" alt="h2" width="40">
<img src="https://tomcat.apache.org/res/images/tomcat.png" alt="tomcat" width="52">
<img src="https://wiki.postgresql.org/images/3/30/PostgreSQL_logo.3colors.120x120.png" alt="Yup" width="40">

## Domain Model

The domain model of the API consists of the following entities:

- User: Represents the store users with attributes like name, email, phone, and password.
- Order: Represents the orders placed by users, with information such as order date and status.
- Category: Represents the categories of products sold in the store.
- Product: Represents the products available for purchase, with information like name, description, and price.
- OrderItem: Represents the items of an order with a many-to-many association with products, including additional attributes like quantity and unit price.

![](https://github.com/jbrun0r/assets/blob/main/RESTful-E-Commerce-API/domain-model.png?raw=true)

## Logical Layers

The project follows a logical layers structure for better code organization:

- Domain: Contains the classes representing the domain model of the application (entities).
- Repositories: Contains the JPA repositories that interact with the database.
- Services: Contains the business services that perform the API operations.
- Resources: Contains the REST controllers that define the API endpoints.

## Database Configuration

The API uses H2 as the database for development and testing, with support for PostgreSQL in production environments. The database configuration is done in the `application.properties` file, and the test configuration is defined in the `application-test.properties` file.

## Future Improvements

This is a project in continuous development, and improvements and new features will be added over time. Feel free to contribute with suggestions and ideas!

## Technologies

<img src="https://upload.wikimedia.org/wikipedia/pt/thumb/3/30/Java_programming_language_logo.svg/234px-Java_programming_language_logo.svg.png" alt="Java" width="30">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Jakarta_ee_logo_schooner_color_stacked_default.svg/1200px-Jakarta_ee_logo_schooner_color_stacked_default.svg.png" alt="Rasa" width="50">
<img src="https://spring.io/img/favicon.ico" alt="spring" width="40">
<img src="https://spring.io/img/projects/spring-tool.svg" alt="sts4" width="40">
<img src="https://www.vectorlogo.zone/logos/hibernate/hibernate-icon.svg" alt="Tailwind CSS" width="40">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Apache_Feather_Logo.svg/64px-Apache_Feather_Logo.svg.png" alt="maven" width="22">
<img src="https://www.h2database.com/html/images/h2-logo-2.png" alt="h2" width="40">
<img src="https://tomcat.apache.org/res/images/tomcat.png" alt="tomcat" width="52">
<img src="https://wiki.postgresql.org/images/3/30/PostgreSQL_logo.3colors.120x120.png" alt="Yup" width="40">
