package module10.Activity6;

public class InterfaceActivityClass {
    public static void main(String[] args) {
        // Create Bike and Car instances using vehicle reference
        Vehicle car=new Car();
        Vehicle bike=new Bike();
        //  Call bike methods
        bike.start();
        bike.stop();

        //  Call car methods
        car.start();
        car.stop();
    }
}
