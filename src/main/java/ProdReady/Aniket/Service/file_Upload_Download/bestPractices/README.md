### File Upload Security Best Practices

- Handling files is risky if not secured properly in your system.

- Following are some essential validations every backend should implement 👇

1️⃣ Validate File Type

- Only allow trusted file types:

    - `✔ .jpg, .png, .pdf`
    - ❌ Block executable or unknown formats

👉 Use:

- file.getContentType()

---

2️⃣ Limit File Size

- Prevent large uploads that can crash your system or cause abuse.

- You can configure it via limiting file size in application.properties

```properties
spring.servlet.multipart.max-file-size=5MB
spring.servlet.multipart.max-request-size=10MB
```

---
3️⃣ Sanitize Filename

- Never trust user-provided filenames❗

```
🔹Remove special characters
🔹Avoid path traversal (../)
🔹Generate unique names (UUID)
```

⚠️ Why This Matters?

Without validation:

```
🔹Malicious files can be uploaded
🔹Server storage can be abused
🔹Security vulnerabilities (like directory traversal) can occur.
```