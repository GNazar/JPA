# JPA
Test project to consolidate JPA/Hibernate knowledge

## Task 1.
Build an E-Commerce Application Description: You are tasked with building a basic e-commerce application that allows users to view products, add them to their shopping cart, and place orders. The application should utilize JPA and Hibernate for data persistence and management.

Product Entity:

Create a Product entity class with attributes such as id, name, description, price, and category.
Use the @Entity annotation to mark the class as an entity.
Utilize @Embeddable and @EmbeddedId annotations to represent composite primary keys for the Product entity.
Implement a One-to-Many relationship with a secondary entity, such as Order, to represent the relationship between products and orders.
Use @EntityGraphs to optimize the fetching strategy for the Product entity, specifying which properties to load eagerly to enhance performance.
Implement a filter using the @Filter annotation to restrict access to specific products based on user roles or other criteria.
Order Entity:

Create an Order entity class with attributes such as id, user, date, and status.
Use the @Entity annotation to mark the class as an entity.
Define a One-to-Many relationship with the Product entity to represent the items included in the order.
Repository and Query:

Create repositories for Product and Order entities, and define custom queries using the @Query annotation to retrieve specific products or orders based on criteria, such as category, price range, or user.
Utilize the @Transactional annotation to ensure that business operations related to orders and products are executed within transaction boundaries.
Integration and Testing:

Integrate the entities, repositories, and custom queries into a service layer to handle business logic.
Create integration tests to verify the behavior of the application, including the execution of custom queries, filters, and transaction management.
This real-world task will allow you to apply the mentioned JPA and Hibernate annotations in a practical context, demonstrating their usage in a meaningful application scenario.
