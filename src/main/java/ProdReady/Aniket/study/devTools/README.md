#### Spring Boot Developer Tools (DevTools) help to enhance your development experience with features like:

```
🔹Automatic restarts
🔹Live reload
🔹Runtime property overrides
```

- It also helps to disable template caching during development for faster iteration...

➡️ What is Spring Boot DevTools?

- spring-boot-devtools is a dedicated module that boosts productivity at development time.

➡️ How to enable?

- Add Dependency (Maven):

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <optional>true</optional>
</dependency>

```

### Note:

👉 DevTools is automatically disabled in production, so you don’t need to worry about performance or security issues.

➡️ Why DevTools? Some Benefits:

```
🔹Automatic application restarts on classpath changes
🔹Live reload of static resources in the browser
🔹Runtime property overrides for quick experimentation
🔹Faster template rendering during development
```