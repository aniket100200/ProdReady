#### Modern applications often need to run tasks in the background. For instance:

```
🔹Send daily reports
🔹Clean up old data
🔹Sync systems
```

- Spring Boot makes this possible using @Scheduled.

---

➡️ Enable Scheduling

- You can enable scheduling in your main class, OR the class where you want it, using @EnableScheduling annotation.

---

➡️ Using @Scheduled

- You can use @Scheduled annotation for a task/method, for which different scheduling options are available:

👉 fixedRate

- Runs a task at a fixed interval, regardless of execution time.

👉 fixedDelay

- Runs a task after the previous execution finishes.

👉 cron

- Provides flexible scheduling using cron expressions (I'll explain it deeply in the next post)

---