package ProdReady.Aniket.Service.file_Upload_Download.fileUpload;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploadService {
  String upload(MultipartFile file) throws IOException;
}
