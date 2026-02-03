package jan31;

import jan17.A;

import java.util.*;

public class Main {

    static void main(String[] args) {
//        List<String> cities = new ArrayList<>();
//        cities.add("toronto");
//        cities.add("ottawa");
//        cities.add("Quebec");
//        cities.add("New York");
//        System.out.println(cities);
//
//        ArrayList<String> countries = new ArrayList<>();
//        countries.add("Canada");
//
//        countries.add("US");
//        countries.add("India");
//
//        countries.addAll(1,cities);
//        System.out.println(countries);


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
//        System.out.println(list);
//        list.size();

//        How to loop over linkedlist
//        loops and iterator

        for(Integer ele : list){
            System.out.println(ele);
            if(ele ==30){
                list.addLast(1000000);
            }

        }
        System.out.println(list);


        Iterator<Integer> iterator = list.iterator();



    }
}
