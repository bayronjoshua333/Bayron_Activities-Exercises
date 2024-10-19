package Student_Poll;

import java.io.*;
import java.util.*;

public class StudentPoll {
    public static void main(String[] args) {
        String inputFilePath = "number.txt";
        String outputFilePath = "output.txt";

        try (Scanner scan = new Scanner(System.in);
             PrintWriter numbersFile = new PrintWriter(inputFilePath)) {

            int surveyRes;
            while (true) {
                System.out.print("Enter survey response from 1-10 (0 to exit): ");
                surveyRes = scan.nextInt();
                if (surveyRes <= 0 || surveyRes > 10){ 
                	System.out.println("Exiting the app...");
                	break;
                	}
                numbersFile.println(surveyRes);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Unable to create input file.");
            e.printStackTrace();
        }

        try (Scanner scan = new Scanner(new File(inputFilePath));
             PrintWriter outputFile = new PrintWriter(outputFilePath)) {
            while (scan.hasNextInt()) {
                outputFile.println(scan.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Unable to find input file.");
            e.printStackTrace();
        }
    }
}
