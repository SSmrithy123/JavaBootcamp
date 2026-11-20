package module10.Activities;

public class Employee extends Person{
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

    // Getter for company[cite: 4]
    public String getCompany() {
        return company; // Return company name[cite: 4]
    }

    // Setter for company[cite: 4]
    public void setCompany(String company) {
        this.company = company; // Update company name[cite: 4]
    }

    // Getter for salary[cite: 4]
    public double getSalary() {
        return salary; // Return salary[cite: 4]
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary; // Update salary[cite: 4]
    }

    // Override introduce method from Person
    @Override
    public void introduce() { // Print employee introduction[cite: 4]
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old"); // Print name and age[cite: 1, 4]
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary); // Print job, company, and salary[cite: 4]
    }

}
