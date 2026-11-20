package module10.Activity6;
//Bike class implementing Vehicle interface
public class Bike implements Vehicle {
    // Overriding method from parent class
    @Override
    public void start() { // Start bike
        System.out.println("Bike starts"); // Print bike start message
    }


    @Override
    public void stop() { // Stop bike
        System.out.println("Bike stops"); // Print bike stop message
    }
}
