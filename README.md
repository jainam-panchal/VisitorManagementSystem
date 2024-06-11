**Backend | Visitor Management System**

- **Developed and maintained a Spring Boot backend to offer comprehensive API solutions for an admin panel, gatekeeper panel, and user panel.**
  - **Admin Panel APIs**: 
    - Implemented CRUD operations for managing users and gatekeepers.
    - Developed functionalities to upload CSV files for bulk user and gatekeeper additions.
    - Automated daily visit report generation.
  - **GateKeeper Panel APIs**:
    - Designed search capabilities for visitors by ID number.
    - Created endpoints to add visitors, upload photos, manage visits, and record entry/exit times.
  - **User Panel APIs**:
    - Built functionalities to approve/reject visits and retrieve all pending visit requests.

- **Enhanced the backend with additional features**:
  - **CSV and Image Handling**: Implemented CSV upload and static image serving.
  - **Pagination and Scheduling**: Introduced pagination for data handling and scheduled jobs for periodic tasks.
  - **API Documentation**: Utilized Swagger (springdoc-openapi) for comprehensive API documentation.

- **Ensured code quality and reliability**:
  - Developed unit tests using JUnit to ensure robust functionality and reliability of the APIs.
  - Implemented thorough exception handling to manage errors and improve system resilience.

- **Architected the API request flow**:
  - Structured the flow from data validation to REST controllers, services, DAO repositories (entities), and database interactions.

**Technologies Used**: Spring Boot, Java 21, Spring Data JPA, Spring Validation, Spring Web, Apache Commons CSV, Springdoc OpenAPI, MySQL, Lombok, JUnit
