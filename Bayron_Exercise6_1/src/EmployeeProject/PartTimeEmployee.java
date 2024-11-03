package EmployeeProject;

public class PartTimeEmployee extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
     super(name, employeeId);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculatePay() {
     return hourlyRate * hoursWorked;
 }

 public double getHourlyRate() {
     return hourlyRate;
 }

 public void setHourlyRate(double hourlyRate) {
     this.hourlyRate = hourlyRate;
 }

 public int getHoursWorked() {
     return hoursWorked;
 }

 public void setHoursWorked(int hoursWorked) {
     this.hoursWorked = hoursWorked;
 }
}
