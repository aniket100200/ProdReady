package ProdReady.Aniket.Service.file_Upload_Download.fileUpload.Impl;

import ProdReady.Aniket.Service.file_Upload_Download.fileUpload.FileUploadService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.web.multipart.MultipartFile;

public class LocalFileUploadService implements FileUploadService {

  @Override
  public String upload(MultipartFile file) throws IOException {
    String uploadDir = "uploads/";
    Path path = Paths.get(uploadDir + file.getOriginalFilename());
    Files.createDirectories(path.getParent());
    Files.write(path, file.getBytes());
    return "File Uploaded Successfully :" + file.getOriginalFilename();
  }
}
