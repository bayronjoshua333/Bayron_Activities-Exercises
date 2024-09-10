package Bayron_L31Exercise1;
import java.util.*;
public class Bayron_L31Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z, product;
		Scanner integers = new Scanner(System.in);
		
		System.out.print("Enter 1st Integer: ");
		x = integers.nextInt();
		
		System.out.print("Enter 2nd Integer: ");
		y = integers.nextInt();
		
		System.out.print("Enter 3rd Integer: ");
		z = integers.nextInt();
		
		product = x*y*z;
		System.out.println("the product is "+ product);
	}

}
