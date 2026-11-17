package Day2.Inheritance;

public class Employee_I extends  Person_I{
    // Attributes
    private double salary;
    private String title;

    // Behavior
    // TODO: Write default constructor. Print "I'm an Employee_I Constructor"
//RIGHT CLICK AND GENERATE CONSTRUTOR WITHOUT SELECTING ANY
    public Employee_I() {

        System.out.println("I'm an Employee_I Constructor");
    }

    // TODO: Write getter for double salary
//RIGHT CLICK AND GENERATE GETTER FOR SALARY
    public double getSalary() {
        return salary;
    }
//RIGHT CLICK AND GENERATE SETTER FOR SALARY
    // TODO: Write setter for double salary

    public void setSalary(double salary) {
        this.salary = salary;
    }
//RIGHT CLICK AND GENERATE GETTER FOR TITLE
    // TODO: Write getter for String title

    public String getTitle() {
        return title;
    }

    // TODO: Write setter for String title
//RIGHT CLICK AND GENERATE SETTER FOR TITLE
    public void setTitle(String title) {
        this.title = title;
    }
}
