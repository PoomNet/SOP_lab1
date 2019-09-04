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
public class Controller {
    Apple a = new Apple();
    Samsung s = new Samsung();
    Huawei h = new Huawei();
    Oppo o = new Oppo();
    Nokia n = new Nokia();
@RequestMapping("/mobile/apple")
    public String Apple(){
        return "id : "+a.getId()+"\n"+"ยี่ห้อ : "+a.getBrand()+"\n"+"รุ่น : "+a.getModel()+"\n"+"ราคา : "+a.getPrice();
    }
@RequestMapping("/mobile/samsung")
public String Samsung(){
    return "id : "+s.getId()+"\n"+"ยี่ห้อ : "+s.getBrand()+"\n"+"รุ่น : "+s.getModel()+"\n"+"ราคา : "+s.getPrice();
}
@RequestMapping("/mobile/huawei")
public String Huawei(){
    return "id : "+h.getId()+"\n"+"ยี่ห้อ : "+h.getBrand()+"\n"+"รุ่น : "+h.getModel()+"\n"+"ราคา : "+h.getPrice();
}
@RequestMapping("/mobile/oppo")
public String Appo(){
    return "id : "+o.getId()+"\n"+"ยี่ห้อ : "+o.getBrand()+"\n"+"รุ่น : "+o.getModel()+"\n"+"ราคา : "+o.getPrice();
}
@RequestMapping("/mobile/nokia")
public String Nokia(){
    return "id : "+n.getId()+"\n"+"ยี่ห้อ : "+n.getBrand()+"\n"+"รุ่น : "+n.getModel()+"\n"+"ราคา : "+n.getPrice();
}
}