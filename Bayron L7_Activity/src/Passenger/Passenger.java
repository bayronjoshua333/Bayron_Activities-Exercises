package Passenger;

import java.util.Arrays;

public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	
	void getName(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	void getGender(char gender) {
		this.gender = gender;
	}
	
	public char gender() {
		return gender;
	}
	
	void getNationality (String nationality) {
		this.nationality = nationality;
	}
	
	public String nationality() {
		return nationality;
	}
	
	void getDateOfBirth (String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String dateOfBirth() {
		return dateOfBirth;
	}
	
	void getPassport (String [] passport) {
		this.passport = passport;
	}
	
	public String[] passport() {
		return passport;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger passenger = new Passenger();
		passenger.getName("Joshua M Bayron");
		passenger.getGender('M');
		passenger.getNationality("Uuwi na!");
		passenger.getDateOfBirth("2001-10-04");
		String[] passport = {"Joshua M Bayron","Uuuwi na!", "2001-10-04"};
		passenger.getPassport(passport);
		
		System.out.println(passenger.name());
		System.out.println(passenger.gender());
		System.out.println(passenger.nationality());
		System.out.println(passenger.dateOfBirth());
		System.out.println(Arrays.toString(passenger.passport()));
	}
}
