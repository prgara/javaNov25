package jan06;

public final class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "employee='" + name + '\'' +
                '}';
    }



}
