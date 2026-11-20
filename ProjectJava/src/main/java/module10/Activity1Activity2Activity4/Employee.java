package module10.Activity1Activity2Activity4;

import java.util.List;

public class Employee extends Person {
    // Employee-specific attributes
    private String jobTitle; // Job title
    private String company; // Company name
    private double salary; // Salary amount

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor to set all fields
    public Employee(String name, int age, String jobTitle, String company, double salary) { // Accept name, age, jobTitle, company, and salary
        setName(name); // Set inherited name
        setAge(age); // Set inherited age
        this.jobTitle = jobTitle; // Set job title
        this.company = company; // Set company
        this.salary = salary; // Set salary
    }

    // Getter for jobTitle
    public String getJobTitle() {
        return jobTitle; // Return job title
    }

    // Setter for jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle; // Update job title
    }

    // Getter for company
    public String getCompany() {
        return company; // Return company name
    }

    // Setter for company
    public void setCompany(String company) {
        this.company = company; // Update company name
    }

    // Getter for salary
    public double getSalary() {
        return salary; // Return salary
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Return the name of the employee with the highest salary from the list
    public static String getHighestPaidEmp(List<Employee> empList) { // Find highest paid employee name
        if (empList == null || empList.isEmpty()) {
            return "None"; // Return  if list has no employees
        }

        Employee highestPaid = empList.get(0); // Assume first employee has highest salary initially
        for (Employee emp : empList) { // Loop through every employee in the list
            if (emp.getSalary() > highestPaid.getSalary()) { // Compare current employee salary with highest found
                highestPaid = emp; // Update highestPaid
            }
        } // End of loop
        return highestPaid.getName(); // Return inherited name of highest-paid employee
    }
    // Override introduce method from Person
    @Override
    public void introduce() { // Print employee introduction
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old"); // Print name and age
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary); // Print job, company, and salary
    }

}
