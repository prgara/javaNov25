package dec20;

public class Student {

    String name; // global
    static String course = "Java" ;  //shared memory

    public Student(String name) { // name is a local var
        this.name = name;
    }

    void display() {
        System.out.println("Name is :" + name);
        System.out.println("course is :" + course);
    }


    {
        course = "java";
        System.out.println("Inside the instance block");
    }

    static {

    }


}
