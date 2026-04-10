- Often fixedRate and fixedDelay are not enough, cron expressions are used to have full control over scheduling.

- They allow you to define exact timing for task execution.

➡️ What is a Cron Expression?

- A cron expression is a string with 6 fields that defines when a task should run.

- `second minute hour day-of-month month day-of-week`

Example:

- `0 0 9 * * ?`

- Runs every day at 9:00 AM

---

➡️ Field Breakdown

- Field Allowed Values (6):

```
- Second 0–59
- Minute 0–59
- Hour 0–23
- Day of Month 1–31
- Month 1–12 or JAN–DEC
- Day of Week 0–7 or SUN–SAT
```

➡️ Special Characters

Symbol Meaning:

```
* Every value
  ? No specific value (used in day fields)
  , Multiple values
- Range
  / Step values (intervals)
  ```

---

➡️ How It Works

- Spring’s scheduler:

```
1️⃣ Reads the cron expression
2️⃣ Calculates the next execution time
3️⃣ Triggers the method at the exact moment
```

This repeats automatically 🔄

⚠️ Important Tip

```
You must use ? in either:

Day of Month - OR - Day of Week

👉 You cannot specify both at the same time.
```