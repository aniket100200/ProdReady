### 🐳 Dockerizing Your Spring Boot Application

- Docker is a widely used technology which lets you package your app with all its dependencies into a portable
  container, so that it runs the same everywhere..

- Here are some basic docker commands:

➡️ Creating a Dockerfile

```
FROM openjdk:21
COPY target/myapp.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

- Uses Java 21 base image
- Copies your built JAR
- Runs the app inside the container

➡️ Build Docker Image
---

```
docker build -t myapp
```

🔹Creates an image named myapp
---

➡️ Run the Container

```
docker run -p 8080:8080 myapp

🔹App will be available at:
http://localhost:8080
```

⚠️ Some Tips About Docker

```
🔹Use .dockerignore to reduce image size
🔹Use smaller base images for optimization
🔹Externalize configs using environment variables
```

---