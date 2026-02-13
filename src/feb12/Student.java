package feb12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Student  {
    private final String name;
    private final String email;
    private final List<String> phoneNo;


    public Student(String name, String email, List<String> phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = new ArrayList<>(phoneNo);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPhoneNo() {
        return phoneNo ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(phoneNo, student.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
