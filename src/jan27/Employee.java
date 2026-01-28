package jan27;

public final class Employee {

    private final String name;
    private final int empId;
    private final double salary;

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    //    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", empId=" + empId +
//                ", salary=" + salary +
//                '}';
//    }
}
