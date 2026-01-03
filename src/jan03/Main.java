package jan03;

public class Main extends Employee {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        System.out.println(arr.length);
//        String name = "Pragra Inc Missisuaga";
////        System.out.println(name.length());
//        String inc = name.concat(" Inc");
////        System.out.println(inc);
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(5));
//        System.out.println(name.substring(1,4));
//        String[] s = name.split(" ");
//        for (String ele:
//             s) {
//            System.out.print(ele);
//        }
        Main main = new Main();


        String bank = " Scotia Bank ";
        String institute = "scotia";

////        System.out.println(bank == institute);
//        System.out.println(bank.equalsIgnoreCase(institute));
//        System.out.println(bank);
//        System.out.println(bank.trim());


//        String employee = new String("Harry");
//        String student = new String("Harry");
//
//        System.out.println(employee.equals(student));
//        System.out.println(employee == student);

        Employee employee = new Employee("Harry","123");
        System.out.println(employee);
        employee.talk();
        employee.work();
        employee.withdrwaSalary();


        Manager manager = new Manager();
        manager.name = "Tom";
        manager.id = "234";
        System.out.println(manager);

        manager.talk();
        manager.work();

int count =0;

        for (int i = 0; i < 100000000; i++) {
            System.out.println(i);
        }


    }






}



