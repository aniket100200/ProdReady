### Spring Boot - File Upload & Download

- Spring Boot allows to handle file uploads and downloads using MultipartFile and REST APIs.

Common use cases:

```
🔹User profile images
🔹Document management systems
🔹File sharing features
```

---

➡️ Multipart File Upload

- Spring Boot provides built-in support for handling file uploads via MultipartFile.

➡️ How to Test

```
🔹Set POST request to /files/upload
🔹Use form-data
🔹Key: file → Select any file
```

---
You can test easily using tools like Postman.

⚠️ Some Best Practices about File Processing

```
🔹Validate file type & size
🔹Avoid storing files with original names (use unique IDs)
🔹Store files securely (local / cloud like S3)
🔹Handle exceptions properly
```

👉 Key Takeaway

- MultipartFile makes file upload simple and efficient, but always ensure security and proper validation when handling
  user files❗

---

### Source Code

```java

@RestController
@RequestMapping("/files")
public class FileUploadController {

    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file)
            throws IOException {
        String uploadDir = "uploads/";
        Path path = Paths.get(uploadDir + file.getOriginalFilename());
        Files.createDirectories(path.getParent());
        Files.write(path, file.getBytes());

        return ResponseEntity.ok("File Uploaded Successfully :" + file.getOriginalFilename());
    }
}

```