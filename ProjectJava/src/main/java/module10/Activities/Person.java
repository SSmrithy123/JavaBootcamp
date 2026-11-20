package module10.Activities;
//created abstract class using abstract keyword
//Abstract base class representing a person.
public abstract class Person {
    //initialializing variable
    // Private attributes for encapsulation
    private String name;
    private int age;
    //generating getters and setters(rightclick-->click generate-->select attribute--->genrate)
//Gets the person's name @return the name of the person
    public String getName() {
        return name;
    }
//Sets the person's name
    public void setName(String name) {
        this.name = name;
    }
//Gets the person's age @return the age of the person
    public int getAge() {
        return age;
    }
//Sets the person's age.
    public void setAge(int age) {
        this.age = age;
    }
//abstract method with no body
    public abstract void introduce();


   /* public static void main(String[] args) {
        // Create a Student object referenced as Person
        Person student = new Student();
        // Set values using inherited setter methods
        student.setName("Smrithy");
        student.setAge(31);
        // Call the introduce() implementation
        student.introduce();
    }*/

}
