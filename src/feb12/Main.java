package feb12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    static void main(String[] args) {
        HashMap<Student,Integer> marks = new HashMap<>();
        ArrayList<String> nums = new ArrayList<>();
        nums.add("9876543210");
        nums.add("987637483");
        Student s1 = new Student("Harry","harry@gmail.com",nums);
        Student s2 = new Student("Tom","tom@gmail.com",nums);
        Student s3 = new Student("Sam","sam@gmail.com",nums);
        marks.put(s1,78);
        marks.put(s2,98);
        marks.put(s3,76);
        System.out.println(marks);

        System.out.println(marks.get(s1));

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(nums);

        ICalculator cal = a  -> {

            System.out.println(a);
            System.out.println("Hello world");

        };

        cal.print(10);
//        System.out.println(cal.print());


    }
}
