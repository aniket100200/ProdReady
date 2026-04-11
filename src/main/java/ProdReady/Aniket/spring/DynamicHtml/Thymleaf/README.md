### Spring Boot - Using Thymeleaf for Dynamic HTML

- Thymeleaf is a server-side template engine that lets you build dynamic HTML using Spring Boot.

- It is useful for:
    ```
    🔹Server-rendered web apps
    🔹Dynamic pages without frontend frameworks
    🔹Clean integration with Spring MVC
    ```

---
➡️ How to integrate in spring boot?

```
🔹Add Dependency
🔹Add Controller
🔹Add Template
```

📁 Location:

```url
src/main/resources/templates/home.html
```

---

➡️ How It Works

```
🔹Controller sends data via Model
🔹Thymeleaf injects it into HTML using th:* attributes
🔹Final HTML is rendered on the server
```

🌐 Access URL

👉 http://localhost:8080/home

---

### Dependency

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

```properties

```
