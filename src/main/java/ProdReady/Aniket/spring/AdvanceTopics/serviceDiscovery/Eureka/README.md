### In microservices, different services need to find and communicate with each other dynamically...

- Where, Hardcoding URLs is not a good solution obviously, and also not scalable ❌

- That’s where Eureka (Service Discovery) comes in.

➡️ What is Eureka?

```
🔹A service registry where all services register themselves
🔹Other services can discover and communicate without knowing exact locations
```

➡️ Steps to integrate Eureka

```
🔹Add dependency
🔹Configure Eureka Server (Registry) - Acts as a central registry
🔹Configure Eureka Client (Service) - Registers itself with Eureka Server & Can discover other services
```

➡️ How It Works

```
🔹Services start → register with Eureka
🔹Eureka keeps track of all instances
🔹Services call each other using service names
```

---

## Configurations

#### Dependency

```xml

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```