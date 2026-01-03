package jan03;

public class Manager extends Employee {


    void work(){
        System.out.println("Manger is working");
    }





    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
