package aws.mytest.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import aws.mytest.demo.service.MetadataService;
import aws.mytest.demo.service.MetadataServiceImpl;

@Controller
public class MainController {
    @Autowired
    private MetadataService metadataService;

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        metadataService.upload(file);

        return "redirect:/index";
    }
}
