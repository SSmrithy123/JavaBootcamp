package Day2.Inheritance;

public class Person_I {
    // Attributes
    private String name;
    private int age;
    // Behavior
    // TODO: Write default constructor. Print "I'm Person_I constructor"
//RIGHT CLICK AND GENERATE CONSTRUTOR WITHOUT SELECTING ANY
    public Person_I() {
        System.out.println("I'm Person_I constructor");
    }

    // TODO: Write parameterized constructor with variables name and age
//RIGHT CLICK AND GENERATE CONSTRUTOR WITHOUT SELECTING NAME AND AGE
    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO: Write getter for String name
//RIGHT CLICK AND GENERATE GETTER FOR NAME
    public String getName() {
        return name;
    }

    // TODO: Write setter for String name
//RIGHT CLICK AND GENERATE SETTER FOR NAME
    public void setName(String name) {
        this.name = name;
    }

//RIGHT CLICK AND GENERATE GETTER FOR AGE
    // TODO: Write getter for int age

    public int getAge() {
        return age;
    }


    // TODO: Write setter for int age
//RIGHT CLICK AND GENERATE SETTER FOR AGE
    public void setAge(int age) {
        this.age = age;
    }
}
