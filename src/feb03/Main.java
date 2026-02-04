package feb03;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {


    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
//        System.out.println(stack);

        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);
        stack.add(100);
//        System.out.println(stack);


        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(60);
        set.add(40);
        set.add(40);
        set.add(50);

//        System.out.println(set.contains(100));
//        System.out.println(set);


        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C");
        treeSet.add("Java");
        treeSet.add("C#");
        treeSet.add("JavaScript");
//        System.out.println(treeSet);

        List<Employee> list = Arrays.asList(new Employee(12, "Harry", 1234),
                new Employee(16, "Harry", 1234),
                new Employee(15, "Harry", 1234),
                new Employee(13, "Tom", 1234),
                new Employee(14, "John", 1234)
        );

        Set<Employee> employeeSet = new HashSet<>(list);
        System.out.println(employeeSet);

        System.out.println(list);

    }
}
