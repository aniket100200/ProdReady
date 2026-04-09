### When your application scales beyond a single instance, in-memory caches are no longer enough.

- That’s where we need Redis - a distributed cache.

---

➡️ Why Redis?

- Unlike in-memory caches (like Caffeine or Ehcache):

```
 🔹Works across multiple application instances
🔹Stores data outside your app (separate server)
🔹Enables shared caching in distributed systems
```

- Useful for microservices architectures❗

---


➡️ How to Configure

````
🔹Add Dependency
🔹Add Configuration (application.properties)
````

#### Depedency

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
    <version>4.1.0-M3</version>
    <scope>compile</scope>
</dependency>
```

### application.properties

```properties
spring.cache.type=redis
spring.redis.host=${SPRING_REDIS_HOST:localhost}
spring.redis.port=${SPRING_REDIS_PORT:6379}
```

---

- Now, Spring Boot will automatically use Redis as the cache provider.

➡️ How It Works

```
🔹Your application stores cache data in Redis
🔹All instances of your app access the same cache
🔹Cached data survives if application restarts (if Redis is running)
```

---

### docker redis

```terminaloutput
docker exec -it my-local-redis redis-cli
```