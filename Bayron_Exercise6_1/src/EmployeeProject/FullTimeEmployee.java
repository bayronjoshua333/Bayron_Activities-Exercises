package EmployeeProject;

public class FullTimeEmployee extends Employee {
 private double monthlySalary;

 public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
     super(name, employeeId);
     this.monthlySalary = monthlySalary;
 }

 @Override
 public double calculatePay() {
     return monthlySalary;
 }

 public double getMonthlySalary() {
     return monthlySalary;
 }

 public void setMonthlySalary(double monthlySalary) {
     this.monthlySalary = monthlySalary;
 }
}
