package core_java_mini_ecommerce;
import java.util.ArrayList;
public class EcommerceService {

	    ArrayList<Product> products =new ArrayList<>();

	    ArrayList<CartItem> cart =new ArrayList<>();

	    // Load Products
	    public void loadProducts() {

	        products.add(new Product(1,"Laptop", 50000));
	        products.add( new Product(2, "Mobile",20000));
	        products.add(new Product(3, "Headphones",2000));
	    }

	    // View Products
	    public void viewProducts() {

	        System.out.println("\n===== AVAILABLE PRODUCTS =====");
	        for(Product p : products) {
	            p.display();
	        }
	    }

	    // Find Product
	    public Product findProduct(int id) {
	        for(Product p : products) {
	            if(p.getId() == id) {
	                return p;
	            }
	        }
	        return null;
	    }

	    // Add To Cart
	    public void addToCart(int productId,int quantity) {

	        Product p =findProduct(productId);
	        if(p != null) {
	            CartItem item =new CartItem( p,quantity);
	            cart.add(item);
	            System.out.println("Product Added To Cart");
	        }
	        else {
	            System.out.println("Product Not Found");
	        }
	    }

	    // View Cart
	    public void viewCart() {
	        if(cart.isEmpty()) {
	            System.out.println( "Cart Is Empty");
	            return;
	        }

	        System.out.println( "\n===== YOUR CART =====");
	        for(CartItem item : cart) {
	            item.displayCartItem();
	        }
	    }

	    // Generate Bill
	    public void generateBill() {
	        double totalBill = 0;
	        System.out.println( "\n===== FINAL BILL =====");
	        for(CartItem item : cart) {
	            item.displayCartItem();
	            totalBill = totalBill + item.getTotalPrice();
	        }

	        System.out.println("\nTotal Bill : " + totalBill);
	    }
	
}
