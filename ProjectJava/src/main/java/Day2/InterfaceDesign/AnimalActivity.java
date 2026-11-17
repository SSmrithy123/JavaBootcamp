package Day2.InterfaceDesign;

public class AnimalActivity {
    public static void main(String arg[]) {


            // Testing with a Cat
            Mammal catMammal = new Mammal("Whiskers");
            catMammal.setAnimal(new Cat());
            catMammal.animalIsSpeaking();
            catMammal.animalIsSleeping();

            System.out.println("-------------------");

            // Testing with a Dog
            Mammal dogMammal = new Mammal("Rover");
            dogMammal.setAnimal(new Dog());
            dogMammal.animalIsSpeaking();
            dogMammal.animalIsSleeping();
        }
    }

