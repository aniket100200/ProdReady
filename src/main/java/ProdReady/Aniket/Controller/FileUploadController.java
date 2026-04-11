package ProdReady.Aniket.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
