package base;

public class InheritancePrinciple {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Vasya";
        dog.name = "Barsik";

        cat.colour = "White";
        dog.colour = "Black";

        cat.walk("Backyard" );
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is: " + cat.name);
        System.out.println("Dog name is: " + dog.name);


    }
}
