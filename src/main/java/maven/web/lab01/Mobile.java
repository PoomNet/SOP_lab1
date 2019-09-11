package maven.web.lab01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String brand;
    private String model;
    private int    price;
    private int stock;
    
    public Mobile() {
    	super();
    }
    
    public Mobile(Long id, String brand,String model, int price,int stock){
    	super();
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
    }
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long i) {
		this.id = i;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String buyMobile() {
		return "Your purchase successfully";
	}
}
