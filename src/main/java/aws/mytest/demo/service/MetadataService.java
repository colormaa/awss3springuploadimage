package aws.mytest.demo.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface MetadataService {
    public void upload(MultipartFile file) throws IOException;
}
