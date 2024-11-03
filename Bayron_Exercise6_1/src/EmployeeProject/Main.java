package EmployeeProject;

public class Main {
 public static void main(String[] args) {
     FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 1, 50000.00);
     PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 2, 450.00, 44);
     Contractor contractor = new Contractor("Charlie", 3, 360.00, 88);

     System.out.println("Full time employee rate: $" + fullTimeEmployee.calculatePay());
     System.out.println("Part time employee rate: $" + partTimeEmployee.calculatePay());
     System.out.println("Contractor rate: $" + contractor.calculatePay());
 }
}
