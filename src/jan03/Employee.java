package jan03;

public class Employee {

    String name;
    String id;

    Employee(){

    }

    Employee(String name, String id){
        this.name = name;
        this.id = id;
    }

    void work(){
        System.out.println("Employee is working");
    }

    void talk(){
        System.out.println("Talking");
    }

    void withdrwaSalary(){
        System.out.println("salary withdrawn");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
