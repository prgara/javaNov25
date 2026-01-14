package jan13;

public class Student {

    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getname(){
        return name;
    }


    private void show(){

        System.out.println("Student name is :" + name + " and roll num is "+ rollNo );
    }
}
