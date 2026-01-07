package jan06;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

    static void main() {
        Animal animal = new Animal();
        animal.sound();


        // Parent ref    = //Object is of child
        Animal dog = new Dog(); // Upcasting implicitly , Downcasting
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

    }
}
