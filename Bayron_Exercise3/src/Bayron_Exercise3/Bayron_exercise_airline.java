package Bayron_Exercise3;
import java.util.*;
public class Bayron_exercise_airline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] seats = new boolean[10];
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Please type number that what you want! \n"
					+ "For First Class -------------------- '1'\n"
					+ "For Economy     -------------------- '2'" );
			System.out.print("Please type it here: ");
			int userType = scan.nextInt();
			if (userType == 1) {
				if(!assignSeats(seats, 0,5)) {
					 System.out.println("First Class is full. Would you like to be placed in Economy? (y/n): ");
	                 char choice = scan.next().charAt(0);
	                 
	                 if (choice == 'y' || choice == 'Y') {
	                    if (!assignSeats(seats, 5,10)) {
	                            System.out.println("First Class is also full. Next flight leaves in 3 hours.");
	                    }
	                 } else {
	                     System.out.println("Next flight leaves in 3 hours.");
	                    }
				}else {
					System.out.println("Next flight leaves in 3 hours");
				}
			}else if (userType == 2) {
				if(!assignSeats(seats, 5,10)) {
					 System.out.println("Economy Class is full. Would you like to be placed in First Class? (y/n): ");
	                 char choice = scan.next().charAt(0);
	                 
	                 if (choice == 'y' || choice == 'Y') {
	                    if (!assignSeats(seats, 0,5)) {
	                            System.out.println("Economy Class is also full. Next flight leaves in 3 hours.");
	                    }
	                 } else {
	                     System.out.println("Next flight leaves in 3 hours.");
	                    }
				}else {
					System.out.println("Next flight leaves in 3 hours");
				}
			}else {
				System.out.println("No Class Found!");
			}
		}
	}
	public static boolean assignSeats(boolean[] seats, int start, int end) {
		// TODO Auto-generated method stub
		 for (int i = start; i < end; i++) {
			 	if(!seats[i]) {
			 		seats[i] = true;
			 		String section = (start == 0)? "First Class" : "Second Class";
			 		System.out.println("You are "+ section +" ,Seat Number #" + (i+1) +", Please arrive on time");
			 		return true;
			 	}
	      }
	      return false;  
	    }
	}