package ProdReady.Aniket.Service.file_Upload_Download.fileDownload;

import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface FileDownloadService {
  ResponseEntity<Resource> download(String filename) throws IOException;
}
