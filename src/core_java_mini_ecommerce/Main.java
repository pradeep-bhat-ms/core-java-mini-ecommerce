package core_java_mini_ecommerce;
import java.util.Scanner;
public class Main {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        EcommerceService service =new EcommerceService();

	        // Load Products
	        service.loadProducts();
	        while(true) {

	            System.out.println("\n===== MINI E-COMMERCE SYSTEM =====");
	            System.out.println("1. View Products");
	            System.out.println("2. Add To Cart");
	            System.out.println("3. View Cart");
	            System.out.println("4. Generate Bill");
	            System.out.println("5. Exit");
	            System.out.print("Enter Choice : ");
	            int choice = sc.nextInt();
	            switch(choice) {
	                case 1:
	                    service.viewProducts();
	                    break;

	                case 2:
	                    System.out.print( "Enter Product ID : ");
	                    int pid =sc.nextInt();
	                    System.out.print( "Enter Quantity : ");
	                    int qty =sc.nextInt();
	                    service.addToCart(pid,qty);
	                    break;

	                case 3:
	                    service.viewCart();
	                    break;

	                case 4:
	                    service.generateBill();
	                    break;

	                case 5:
	                    System.out.println("Thank You");
	                    System.exit(0);

	                default:

	                    System.out.println("Invalid Choice");
	            }
	        }
	    }
	}

