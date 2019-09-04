package maven.web.lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class MobileController {
@RequestMapping("/mobile")
    public String toString(){
        return "Apple"+"\n"+"Samsung"+"\n"+"Huawei"+"\n"+"Oppo"+"\n"+"Nokia";
    }
}