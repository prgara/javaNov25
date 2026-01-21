package jan17;

public abstract class Employee {


    int id ;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

     double calSalary(){
        return 1.1;
    };
}
