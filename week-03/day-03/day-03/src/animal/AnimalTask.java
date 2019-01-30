package animal;

public class AnimalTask {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        System.out.println("My hunger level is: " + animal1.hunger + " and my thirst level is: " +
                animal1.thirst);

        animal1.eat();
        animal1.drink();
        System.out.println("My hunger level is: " + animal1.hunger + " and my thirst level is: " +
                animal1.thirst);
    }
}
