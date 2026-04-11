### After uploading files, the next step is to store and serve them securely via REST APIs.

➡️ Download File Endpoint

```java

@GetMapping("/download/{filename}")
public ResponseEntity<Resource> downloadFile(@PathVariable("filename") String filename) throws IOException {
    return downloadService.download(filename);
}

@Service
@Primary
public class LocalFileDownloadService implements FileDownloadService {
    @Override
    public ResponseEntity<Resource> download(String filename) throws IOException {
        Path path = Paths.get("uploads/" + filename);
        Resource resource = new UrlResource(path.toUri());

        if (!resource.exists())
            throw new FileNotFoundException("Unable to find the File with Name: " + filename);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename\"" + filename + "\"")
                .body(resource);
    }
}
```

---
➡️ How It Works

```
1️⃣ File is read from uploads / directory
2️⃣ Converted into a Resource
3️⃣ Returned with proper HTTP headers
4️⃣ Browser downloads it as a file
```

---
➡️ Some Key Points About Code

```
🔹Content-Disposition → forces download
🔹APPLICATION_OCTET_STREAM → generic file type
🔹Handles missing files safely (404 response)
```