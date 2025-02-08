# Spring Security with JWT Authentication

## Introduction
This project demonstrates the implementation of Spring Security with JWT authentication. Initially, user details were stored using `InMemoryUserDetailsManager`, but later, the project was upgraded to use an H2 database for persistent storage. JWT (JSON Web Token) is used for enhanced security and stateless authentication.

## What is Spring Security?
Spring Security is a powerful authentication and access control framework for Java applications. It provides protection against common security vulnerabilities, such as session fixation, clickjacking, and cross-site request forgery (CSRF). This project uses Spring Security to implement authentication and authorization mechanisms.

## Methods to Store User Data
1. **InMemoryUserDetailsManager**
   - Initially, user credentials were stored in memory.
   - This approach is useful for testing and small applications but lacks persistence.

2. **H2 Database**
   - Later, the project was upgraded to store user details in an H2 database.
   - H2 is an in-memory database that is lightweight and suitable for development and testing environments.

## Importance of JWT in Spring Security
JWT (JSON Web Token) is used to securely transfer authentication information between parties. Instead of using session-based authentication, JWT allows stateless authentication, improving performance and scalability. JWT includes a payload containing user information, which helps verify authorization without storing session data on the server.

## Dependencies Required
To integrate Spring Security with JWT, the following dependencies must be added:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>your_version_here</version>
</dependency>
```

To get the latest JWT dependency, visit: [JWT Dependency](https://github.com/jwtk/jjwt?tab=readme-ov-file#installation)

## Explanation of Key Components
1. **JwtUtils**
   - Responsible for generating and validating JWT tokens.
   - Extracts user details from the token.

2. **AuthTokenFilter**
   - Intercepts incoming requests to check for valid JWT tokens.
   - If a token is present and valid, it allows access to secured endpoints.

3. **AuthEntryPointJwt**
   - Handles unauthorized access.
   - Sends appropriate responses when authentication fails.

4. **SecurityConfig**
   - Configures Spring Security settings.
   - Defines security filters, authentication mechanisms, and endpoint access control.

## How to Run the Application

### Clone the Project
1. Open your terminal or command prompt.
2. Run the following command to clone the repository:
   ```bash
   https://github.com/Cheluri-AshokReddy/Spring-Security-with-JWT-Authentication.git
   ```
3. Navigate to the project directory:
   ```bash
   cd Spring-Security-with-JWT-Authentication
   ```

### Start the Application
1. Run the `SecuritydemoApplication` file to start the application.
2. Ensure all dependencies are resolved and the application starts without errors.

### Sending API Requests
Use Postman or any REST client to send API requests.

#### Authenticate Using JWT
1. **Sign In:**
   - Send a `POST` request to `http://localhost:8080/signin` with your username and password in the request body.
   - Upon successful authentication, a JWT token will be generated.

2. **Access a Secured Endpoint:**
   - Send a `GET` request to `http://localhost:8080/hello`.
   -  In the **Authorization** tab of Postman select **No Auth**.
   - In the headers, add the following:
     - **Key:** `Authorization`
     - **Value:** `Bearer <your_jwt_token>`

Now, your request will be authenticated using JWT.


## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request.

1. **Fork** the repository.
2. **Create a new branch**:

```bash
git checkout -b feature-branch
```

3. **Make your changes**.
4. **Commit your changes**:

```bash
git commit -m 'Add some feature'
```

5. **Push to the branch**:

```bash
git push origin feature-branch
```

6. **Submit a pull request**.

---



## Conclusion
This project showcases Spring Security with JWT authentication, starting with `InMemoryUserDetailsManager` and transitioning to an H2 database. JWT ensures secure, stateless authentication, making it an ideal choice for modern applications.

## Contact

For any questions, please contact:

**Ashok Reddy Cheluri**

GitHub: [Cheluri-AshokReddy](https://github.com/Cheluri-AshokReddy)  <br>
Linkedin: [ashokreddycheluri](https://www.linkedin.com/in/ashokreddycheluri-740603235/)


