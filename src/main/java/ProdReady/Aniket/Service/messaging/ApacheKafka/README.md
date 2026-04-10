#### Apache Kafka is a distributed event streaming platform designed for high-throughput, scalable, and fault-tolerant messaging.

- It’s widely used for:

```
🔹Real-time data pipelines
🔹Event-driven architectures
🔹Large-scale distributed systems
```

➡️ How to Configure

```
🔹Add Dependency
🔹Add Configuration (application.properties)
🔹Add Producer (Send Event)
🔹Add Consumer (Listen to Events)
```

➡️ How It Works

```
1️⃣ Producer sends message to a topic
2️⃣ Kafka stores it in a distributed log
3️⃣ Consumers read messages independently using consumer groups
```

--- 

## Configuration

#### Dependency

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-kafka</artifactId>
</dependency>
```

```properties
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=my-group
spring.kafka.consumer.auto-offset-reset=earliest
```