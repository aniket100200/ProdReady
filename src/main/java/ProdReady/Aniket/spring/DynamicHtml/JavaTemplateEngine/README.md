### Spring Boot - Alternatives to Theamleaf

- We often see this that Theamleaf is outdated now...

- I would say it's true to some extent, but it's not completely outdated, but modern development has shifted.

- Let's see how...

➡️ The Modern Approach

- Today, most applications follow:

```
🔹Backend → Spring Boot (REST APIs)
🔹Frontend → React / Angular / Vue

🔹UI is handled by frontend frameworks
🔹Spring Boot focuses on APIs
```

➡️ But Thymeleaf Still Used In:

- Simple apps
- Admin panels
- Internal tools
- Server-side rendering (SSR)

---
➡️ And What About JTE (Java Template Engine)

- JTE is a modern server-side template engine gaining popularity, after Theamleaf. So, it can also be used.

➡️ Why JTE is becoming popular?

It brings some additional benefits:

```
🔹Compiles templates into Java → which is very fast
🔹Type-safe (errors caught at compile time)
🔹Cleaner & simpler syntax
🔹Lightweight compared to Thymeleaf
```

Example:

`@param String message`

```html
    <h1>${message}</h1>
```

---

### Configuration

#### Dependency

```xml

<dependency>
    <groupId>gg.jte</groupId>
    <artifactId>jte-spring-boot-starter-3</artifactId>
    <version>3.1.12</version>
</dependency>
```

- Project Structure
    - By default, JTE looks for templates in src/main/jte. You need to create this folder manually.

    - Root: src/main/jte

    - Example Page: src/main/jte/index.jte
