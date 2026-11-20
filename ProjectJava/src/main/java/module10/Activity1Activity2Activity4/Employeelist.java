package module10.Activity1Activity2Activity4;

import java.util.ArrayList;
import java.util.List;

public class Employeelist {
    public static void main(String[] args) {
// Create 5 Employee objects using the Employee constructor
        Employee emp1 = new Employee("Smrithy", 31, "QA Engineer", "Accenture", 11500.0); // First employee
        Employee emp2 = new Employee("Francis", 32, "Automation Tester", "ABC", 2000.0); // Second employee
        Employee emp3 = new Employee("Johaan", 35, "Developer", "XYZ", 3000.0); // Third employee
        Employee emp4 = new Employee("Radika", 30, "Scrummaster", "PQR", 6000.0); // Fourth employee
        Employee emp5 = new Employee("Evan", 40, "QA Lead", "ABC", 7000.0); // Fifth employee

        //  Create list of Employees and add all 5 employee objects
        List<Employee> empList = new ArrayList<Employee>(); // Initialize ArrayList of Employee
        empList.add(emp1); // Add first employee to list
        empList.add(emp2); // Add second employee to list
        empList.add(emp3); // Add third employee to list
        empList.add(emp4); // Add fourth employee to list
        empList.add(emp5); // Add fifth employee to list

        // Print the required statement using getHighestPaidEmp
        System.out.println("The Employee whose salary is the highest is :" + Employee.getHighestPaidEmp(empList)); // Print highest-paid employee name
    }
    }

