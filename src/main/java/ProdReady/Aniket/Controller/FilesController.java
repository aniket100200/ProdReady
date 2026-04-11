package ProdReady.Aniket.Controller;

import ProdReady.Aniket.Service.file_Upload_Download.fileDownload.FileDownloadService;
import ProdReady.Aniket.Service.file_Upload_Download.fileUpload.FileUploadService;
import ProdReady.Aniket.enums.AllowedFileType;
import ProdReady.Aniket.exceptions.InvalidFileTypeException;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FilesController {

  @Autowired FileUploadService fileUploadService;
  @Autowired FileDownloadService downloadService;

  @PostMapping("/upload")
  public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file)
      throws IOException {
    String fileName = file.getOriginalFilename();
    if (fileName == null) throw new IllegalArgumentException("File Name is Missing");

    String extension = fileName.substring(fileName.indexOf(".") + 1);
    AllowedFileType fileType = AllowedFileType.fromExtension(extension);
    if (fileType == null)
      throw new InvalidFileTypeException(
          " File type with ." + extension + " extension is not Allowed");
    return ResponseEntity.ok(fileUploadService.upload(file));
  }

  @GetMapping("/download/{filename}")
  public ResponseEntity<Resource> downloadFile(@PathVariable("filename") String filename)
      throws IOException {
    return downloadService.download(filename);
  }
}
