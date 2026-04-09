### Cache Providers

- Spring Boot supports multiple cache providers, you can choose one based on your application needs...

Popular one's are:

```
🔹Ehcache / Caffeine → In-memory, fast, simple
🔹Redis → Distributed, scalable, production-ready
```

1️⃣ Ehcache (In-Memory, Java-Based)

- A reliable, widely used in-memory cache for standalone applications.

```
🔹Add dependency
🔹Add configuration (ehcache.xml)
```

- Good for simple apps with moderate caching needs

__________________________________________________________________________

### Dependency for ehcache

```xml

<dependency>
    <groupId>org.ehcache</groupId>
    <artifactId>ehcache</artifactId>
</dependency>

<dependency>
<groupId>org.ehcache</groupId>
<artifactId>ehcache</artifactId>
</dependency>


<dependency>
<groupId>javax.xml.bind</groupId>
<artifactId>jaxb-api</artifactId>
<version>2.3.1</version>
</dependency>

<dependency>
<groupId>org.glassfish.jaxb</groupId>
<artifactId>jaxb-runtime</artifactId>
<version>2.3.1</version>
</dependency>

```

#### ehcache.xml

```xml

<config>
    <!--    alis is the name of the Cache -->
    <cache alias="employees">
        <heap>1000</heap>
    </cache>
</config>
```

```properties
spring.cache.type=jcache
spring.cache.jcache.config=classpath:ehcache.xml
```

------------------------------------------------------------------------

2️⃣ Caffeine (High-Performance Cache)

- A modern, high-performance in-memory cache known for speed and efficiency.

```
🔹Add dependency
🔹Add configuration (application.properties)
```

- Good for high-performance applications with frequent reads

---

### Dependency and Configuration for Caffeine

#### Dependency

```xml

<dependency>
    <groupId>com.github.ben-manes.caffeine</groupId>
    <artifactId>caffeine</artifactId>
</dependency>
```

#### application.properties

```properties
spring.cache.type=caffeine
# Configure the cache rules (Max 1000 items, expire 10 minutes after writing)
spring.cache.cache-names=employees
spring.cache.caffeine.spec=maximumSize=1000,expireAfterAccess=5m
```

### Provide Custom CacheManager Bean

```java

public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager("employees", "departments");

        // Set the default behavior for these caches
        cacheManager.setCaffeine(Caffeine.newBuilder()
                .initialCapacity(100)
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .recordStats()); // Lets you see cache hit/miss metrics if you use Spring Actuator

        return cacheManager;
    }
}
```

---