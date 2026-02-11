package feb9;

public class Animal {
}


class Dog extends Animal{

}



class Test {

    static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal = new Dog(); // Upcasting
        Dog d = (Dog) animal;  // Downcasting


        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Object);
    }
}
