package module10.Activity1;

public class Student extends Person{
    // Overrides the abstract introduce() method from Person
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " and I am " + getAge() + " years old.");
    }
}
