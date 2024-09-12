package Bayron_Exercise3;

public class Bayron_exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 10;
		double[] fractions = new double[ARRAY_SIZE];
		
		System.out.println("Referred: "+fractions[4]);
		
		fractions[9] = 1.667;
		fractions[6] = 3.333;
		
		double sum = 0.0;
		for(int x = 0; x < ARRAY_SIZE; x++) {
			sum +=fractions[x];
		}
		
		System.out.println("Result: " + sum);
	}

}
