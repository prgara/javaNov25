package dec13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //data type                   ref/name          assgn opt                   value
        int                              x               =                            10;
        Animal                         animal            =                       new Animal();

//        animal.eat();
        animal.color = "Red";
        animal.age = "12 yrs";
//        animal.makeSound();

        Animal sheep = new Animal();
        System.out.println(sheep.calculateWeight());
//        sheep.makeSound();

        System.out.println(animal.x);
        animal.makeSound();



    }


}
