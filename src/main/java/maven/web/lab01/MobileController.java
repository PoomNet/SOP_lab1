package maven.web.lab01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@SpringBootApplication
@RestController
//@EnableAutoConfiguration
public class MobileController {
	List<Mobile> Mlist = new ArrayList(Arrays.asList(
            new Apple((long) 1,"apple", "iphone11", 28999, 50),
            new Samsung((long) 2,"samsung", "Galaxy A90 5G", 19999,20),
            new Huawei((long) 3,"huawei", "nova 5T", 14999,30),
            new Oppo((long) 4,"oppo", "Reno2", 12899,40),
            new Nokia((long) 5,"nokia", "220 4G", 8999,20)
    ));
	
	@Autowired
    MobileRes mobres;
	
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
public String BuyM(@PathVariable Long id){
	Mobile mob = new Mobile(mobres.getOne(id).getId() , mobres.getOne(id).getBrand(),mobres.getOne(id).getModel(),mobres.getOne(id).getPrice(),mobres.getOne(id).getStock()-1);
	mobres.save(mob);
	return "buy success";
}

@GetMapping(value = "/mobileall")
public List<Mobile> Mobileall() {
   return mobres.findAll();
}

@RequestMapping(value = "/add", method=RequestMethod.POST)
public void addMobile(@RequestBody Mobile mobile) {
	mobres.save(mobile);
}

@RequestMapping(value = "/delete/{id}")
public void deleteMobile(@PathVariable Long id) {
	mobres.deleteById(id);
}
}