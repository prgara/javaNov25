package jan27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main(String[] args)  {
        Employee emp = new Employee("Sami",123,150000);
//        System.out.println(emp);
        Employee emp1 = new Employee("Tom",23,23432);
//        System.out.println(emp1);

        int[] arr = new int[5]; // fixed

        List<Integer> list = new ArrayList<>();    // Upcasting, dynamic
        list.add(10);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);
//        list.add(20);

//        list.add(5,100);
//        System.out.println(list.size());
//        System.out.println(list.indexOf(20));
//        System.out.println(list.get(2));
//        System.out.println(list);




        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("White");
        color.add("Yellow");
//        System.out.println(color);


//        for (int i = 0; i < color.size(); i++) {
//            System.out.println(color.get(i));
//        }
//
//
//        for(String ele:color){
//            System.out.println(ele);
//        }


        Iterator<String> iterator = color.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}
