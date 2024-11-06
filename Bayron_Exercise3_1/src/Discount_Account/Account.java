package Discount_Account;
import java.util.*;

public class Account {
    public static void main(String[] args) {
    
        Scanner DisAcc = new Scanner(System.in);
        final long startTime = System.nanoTime();
        int Total = 0;
        
        System.out.print("New Customer? (Y/N): ");
        String NewCustomer = DisAcc.nextLine();
        
        System.out.print("Have a Loyalty card? (Y/N): ");
        String Card = DisAcc.nextLine();
        
        System.out.print("Have a Coupon? (Y/N): ");
        String Coupon = DisAcc.nextLine();
        
        if (NewCustomer.equalsIgnoreCase("Y")&&Card.equalsIgnoreCase("Y")) {
        	System.out.println("Loyalty Card are not Applicable to New Customer!");
    		System.exit(0);
        }else if (NewCustomer.equalsIgnoreCase("Y")) {
        	Total = Coupon.equals("Y") ? 20 : 15;
        }else if (NewCustomer.equalsIgnoreCase("N")) {
        	Total = (Card.equalsIgnoreCase("Y")) ? (Coupon.equalsIgnoreCase("Y") ? 30 : 10) : 
        		(Coupon.equalsIgnoreCase("Y")? 20:0); 
        }else {
        	System.out.println("Invalid Input!");
        }
        
        final long duration = (System.nanoTime() - startTime)/1000000000;
        System.out.println("Duration: "+ duration+"ns");
        System.out.println("Discount: " + Total +"%"); 
    }
}