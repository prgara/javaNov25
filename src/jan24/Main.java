package jan24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
//        Bank bank = new Bank(10000);
//
//        System.out.println("Initial Balanace : " + bank.getBalance());
//        try {
//            System.out.println("Balance after withdrawl : " + bank.withdraw(102000));
//        } catch (InsufficientBalException e){
//            e.printStackTrace();
//        }
//        System.out.println("Balance after deposit : " +bank.deposit(2000));
//        System.out.println("End of the program");
//
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(16);
        arrayList.add(20);
//        System.out.println(arrayList);
//
//        int x = 10;
//        float y = x;
//
//        float a = 9.0f;
//        int b = (int) a;
        // update mobile num and user is giving eight nine five four

        Container<String,String> container = new Container<>("123","Sami");
        Container<Integer,String> cont = new Container<>(123,"123");
//        container.printItems();


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Sami",123));
        students.add(new Student("HariPriya",124));
        students.add(new Student("Rupali",122));
        students.add(new Student("Shikha",132));
        System.out.println(students);

    }
}
