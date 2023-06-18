package examples.example2;

import examples.example1.Student1;

import java.util.Objects;

public class Student2 extends Student1 {

    public Student2(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, studentID);
    }
}
