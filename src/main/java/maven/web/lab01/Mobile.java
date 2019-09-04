package maven.web.lab01;

abstract class Mobile {
	private int id;
    private String brand;
    private String model;
    private int    price;
//    public Mobile(String id, String brand,String model, int price){
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.price = price;
//    }
	public int getId() {
		return id;
	}
	public void setId(int i) {
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
}
