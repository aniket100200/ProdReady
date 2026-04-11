package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.file_Upload_Download.fileDownload.FileDownloadService;
import ProdReady.Aniket.Service.file_Upload_Download.fileUpload.FileUploadService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FilesController {

  @Autowired
  FileUploadService fileUploadService;
  @Autowired
  FileDownloadService downloadService;

  @PostMapping("/upload")
  public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file)
      throws IOException {
    return ResponseEntity.ok(fileUploadService.upload(file));
  }

  @GetMapping("/download/{filename}")
  public ResponseEntity<Resource> downloadFile(@PathVariable("filename") String filename) throws IOException {
      return downloadService.download(filename);
  }
}
