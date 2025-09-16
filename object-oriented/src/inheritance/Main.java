package inheritance;

// 1. Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

// 2. Multilevel Inheritance
class Mammal extends Animal {
    void sleep() {
        System.out.println("Mammal sleeps.");
    }
}

// 3. Hierarchical Inheritance
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Single/Multilevel inheritance
        Dog dog = new Dog();
        dog.eat();   // inherited from Animal
        dog.sleep(); // inherited from Mammal
        dog.bark();  // own method

        System.out.println();

        // Hierarchical inheritance
        Cat cat = new Cat();
        cat.eat();   // inherited from Animal
        cat.sleep(); // inherited from Mammal
        cat.meow();  // own method
    }
}
