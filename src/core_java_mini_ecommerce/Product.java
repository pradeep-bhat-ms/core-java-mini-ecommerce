package core_java_mini_ecommerce;

	public class Product {

	    private int id;
	    private String name;
	    private double price;

	    // Constructor
	    public Product(int id,String name,double price) {

	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    // Getter Methods
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    // Display Method
	    public void display() {

	        System.out.println("Product ID : "+ id);
	        System.out.println("Product Name : "+ name);
	        System.out.println("Price : " + price);
	        System.out.println("----------------------");
	    }
	}

