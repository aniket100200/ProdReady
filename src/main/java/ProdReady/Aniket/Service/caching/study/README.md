#### Caching is a powerful technique to improve application performance by:

```
🔹Storing frequently accessed data in cache
🔹Returning it faster on future requests
```

- Instead of repeatedly hitting the database or calling slow services, the application can retrieve the result directly
  from the cache❗

- Spring Boot provides built-in support for caching with multiple providers such as:

```
🔹Ehcache
🔹Caffeine
🔹Redis
```

➡️ Enable Caching in Spring Boot

- To start using caching, enable it in your main application class using @EnableCaching (see attached code 👇)

- This activates Spring’s caching infrastructure.

```java

@SpringBootApplication
@EnableCaching //this enalbles the Chaching
public class AniketApplication {

    public static void main(String[] args) {
        SpringApplication.run(AniketApplication.class, args);
    }

}
```

### Dependancy

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
</dependency>
```


