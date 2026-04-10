#### JMS (Java Message Service) is a standard Java API for messaging, commonly used with brokers like ActiveMQ / Artemis.

- It enables asynchronous communication between different parts of an application or across systems.

➡️ How to Configure

```
🔹Add Dependency
🔹Add Configuration (application.properties)
🔹Add Producer (Send Message)
🔹Add Consumer (Receive Message)
```

➡️ How It Works

```
1️⃣ Producer sends message to a queue
2️⃣ Broker stores and manages the message
3️⃣ Consumer listens and processes it asynchronously
```

---

### Configurations

#### Dependency

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-artemis</artifactId>
</dependency>
```

#### application-jms.properties

```properties
spring-artemis-broker-url=tcp://localhost:61616
spring-artemis-username=admin
spring-artemis-password=admin
```