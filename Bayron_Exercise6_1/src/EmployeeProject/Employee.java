package EmployeeProject;

public abstract class Employee implements Payable {
 private String name;
 private int employeeId;

 public Employee(String name, int employeeId) {
     this.name = name;
     this.employeeId = employeeId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public void setEmployeeId(int employeeId) {
     this.employeeId = employeeId;
 }

 public abstract double calculatePay();
}
