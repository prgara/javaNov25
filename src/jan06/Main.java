package jan06;

public class Main {
    static void main() {
        String s = "JAVA"; //SCP
//        s.concat("World");
        System.out.println(s);

        String s1 = new String("JAVA"); //Heap
//        System.out.println(s == s1); // true -----false
//        System.out.println(s.equals(s1)); // true
        System.out.println(s1);


        Student student = new Student("Tom");
        System.out.println(student); // Tom, Memory address

    }


}
