package maven.web.lab01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class MobileController {
	List<Mobile> Mlist = new ArrayList<>(Arrays.asList(
            new Apple(1,"apple", "iphone11", 28999),
            new Samsung(2,"samsung", "Galaxy A90 5G", 19999),
            new Huawei(3,"huawei", "nova 5T", 14999),
            new Oppo(4,"oppo", "Reno2", 12899),
            new Nokia(5,"nokia", "220 4G", 8999)
    ));
@RequestMapping("/mobile")
	public List<Mobile> All(){
	return Mlist;
}
@RequestMapping("/mobile/{id}")
public Mobile MList(@PathVariable int id){
	for(int i = 0;i<Mlist.size();i++) {
		if(id>Mlist.size()) {
			return null;
		}
		else if(Mlist.get(i)==Mlist.get(id-1)) {
			return Mlist.get(id-1);
		}
		
	}
    return null;
}
@RequestMapping("/buymobile/{id}")
public String BuyM(@PathVariable int id){
	for(int i = 0;i<Mlist.size();i++) {
		if(id>Mlist.size()) {
			return "you can't buy device that Doesn't exist";
		}
		else if(Mlist.get(i)==Mlist.get(id-1)) {
			return Mlist.get(id-1).buyMobile();
		}
		
	}
    return null;
}
}