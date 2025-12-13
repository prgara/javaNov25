package dec13;

public class Animal {
    String name;
    String age;     // instance var/ datamembers/attributes
    String color;
    String type;
    int size;
    double weight;

    int x = 10;

    public void makeSound(){
        int x = 20; // local var
        System.out.println("Animal make sound");
        System.out.println("Value of x is : " + x);
    }

    public void eat(){
        x = 11;
        System.out.println("Animal is eating");
    }

    public String walk(){
//        System.out.println("animal is walking");
        return "Animal is walking";
    }

    public int calculateWeight(){
        return 50;
    }


    // retiurn type -> void, int, String


}
