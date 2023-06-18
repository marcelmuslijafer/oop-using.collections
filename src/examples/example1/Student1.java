package examples.example1;

import examples.Student;

public class Student1 extends Student {

    public Student1(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student1)) return false;
        Student1 other = (Student1) obj;
        return this.studentID.equals(other.studentID);
    }
}
