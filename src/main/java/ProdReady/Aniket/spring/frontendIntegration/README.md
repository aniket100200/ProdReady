### Spring Boot - Frontend Integration - Serving Static Files

- Spring Boot doesn’t just handle APIs, it can also serve frontend content directly.

Useful for:

```
🔹Simple web apps
🔹Admin dashboards
🔹Serving built frontend builds (React, Angular, Vue)
```

---
➡️ Default Static Locations

- Just place your files in any of these folders:

```
src/main/resources/static/
src/main/resources/public/
src/main/resources/resources/
```

---
➡️ Example

src/main/resources/static/index.html

👉 Accessible at:
http://localhost:8080/index.html

➡️ Organizing Assets

/static/js/app.js
/static/css/style.css
/static/images/logo.png

Spring Boot will automatically serve the, no extra configuration required❗

➡️ How It Works

🔹Spring Boot maps static files to root URL
🔹No controller required
🔹Works out-of-the-box