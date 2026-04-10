### RabbitMQ is a popular message broker that enables reliable, asynchronous communication using AMQP (Advanced Message Queuing Protocol).

- It’s widely used for:

```
🔹Background processing
🔹Task queues
🔹Decoupling microservices
```

➡️ How to Configure

```
🔹Add Dependency
🔹Add Configuration (application.properties)
🔹Add Producer (Message Sender)
🔹Add Consumer (Message Receiver)
```

See attached images 👇 for code

➡️ How It Works

```
1️⃣ Producer sends message to a queue
2️⃣ RabbitMQ stores it safely
3️⃣ Consumer listens and processes it asynchronously
```

---

#### Dependency

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
```

#### applications.properties

```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
```