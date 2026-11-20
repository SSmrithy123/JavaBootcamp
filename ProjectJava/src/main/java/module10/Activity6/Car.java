package module10.Activity6;
//Car class implementing Vehicle interface
public class Car implements Vehicle{

    // Overriding method from parent class
    @Override
    public void start() {
        System.out.println("Car engine starts"); // Print car start message
    }

    // Custom stop implementation for Car
    @Override
    public void stop() { // Stop car
        System.out.println("Car comes to stop"); // Print car stop message
    }
}
