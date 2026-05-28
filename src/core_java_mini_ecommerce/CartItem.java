package core_java_mini_ecommerce;

	public class CartItem {

	    private Product product;
	    private int quantity;

	    // Constructor
	    public CartItem(Product product, int quantity) {
	        this.product = product;
	        this.quantity = quantity;
	    }

	    // Calculate Total
	    public double getTotalPrice() {

	        return product.getPrice()* quantity;
	    }

	    // Display Cart Item
	    public void displayCartItem() {

	        System.out.println(product.getName() + " | Quantity : "+ quantity+ " | Total : "+ getTotalPrice());
	    }
	}

