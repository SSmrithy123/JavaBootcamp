package Day2.InterfaceDesign;

public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Dog says: 'bow bow'!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping!");
    }
}
