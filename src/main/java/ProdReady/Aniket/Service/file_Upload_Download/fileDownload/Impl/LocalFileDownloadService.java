package ProdReady.Aniket.Service.file_Upload_Download.fileDownload.Impl;

import ProdReady.Aniket.Service.file_Upload_Download.fileDownload.FileDownloadService;
import ProdReady.Aniket.exceptions.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
