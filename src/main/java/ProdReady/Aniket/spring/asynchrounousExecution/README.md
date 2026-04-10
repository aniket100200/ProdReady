#### In real code, not every task needs to block the main thread...

Operations such as:

```
🔹Sending emails
🔹Processing files
🔹Calling external APIs
```

- These can run in the background, and that’s where ```@Async``` comes in.

➡️ What is Asynchronous Execution (`@Async`)

- `@Async` enables methods to run in a separate thread, allowing non-blocking execution.

➡️ Enabling Async Support

- Use `@EnableAsync` annotation on your main class OR the class where you want to use it.

```java

@EnableAsync
public class MyApp {
}
```

➡️ Using `@Async`

- Use this annotation on the method you want to run in a separate thread.

➡️ Example

- You want to send an email (task) in a background thread, and not let your main thread to be blocked.

---
⚠️ Important Rule

`@Async` won’t work if you call that method from the same class.

👉 It must be called from another Spring class/bean (due to proxy mechanism)