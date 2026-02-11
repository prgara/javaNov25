package feb9;

import java.util.*;

public class Main {

    static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);

//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());


        String s = "Pragra";
//        System.out.println((s instanceof String));
// Student name along with their marks


        Map<String,Integer> marks = new HashMap<>();
        marks.put("Tom",78);   // Entry, entrySet
        marks.put("Jerry",88);
        marks.put("John",98);
        marks.put("Tom",100);
        marks.put("Ram",100);

//        System.out.println(marks);

        System.out.println(marks.get("Tom"));
        System.out.println(marks.containsKey("abc"));


        Collection<Integer> values = marks.values();
        Set<String> strings = marks.keySet();
        for(String str : strings){
            System.out.println(str + "->" + marks.get(str));
        }

        Set<Map.Entry<String, Integer>> entries = marks.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey()+ "->" + entry.getValue());
        }

    }
}
