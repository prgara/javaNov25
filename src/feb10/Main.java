package feb10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {


    static void main(String[] args) {
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("John", 98);
        marks.put("John",99);
        marks.putIfAbsent("Sam",100);
//        System.out.println(marks);
        Set<Map.Entry<String, Integer>> entries = marks.entrySet();

//        for (Map.Entry<String, Integer> entry : entries){
//            System.out.println(entry.getKey() + "-> " + entry.getValue());
//        }

        System.out.println(marks.get("Harry"));

//        String s = "Pragra";
//        System.out.println(s.hashCode());
//
//        String a = "Pragra";
//        System.out.println(a.hashCode());
////        System.out.println(marks.get("John"));
    }
}
