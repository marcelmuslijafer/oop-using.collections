package examples.example3;

import examples.example2.Student2;

public class Student3 extends Student2 implements Comparable<Student3> {

    public Student3(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }

    @Override
    public int compareTo(Student3 other) {
        int diff = this.lastName.length() - other.lastName.length();
        if (diff != 0) {
            return -diff;
        }

        diff = this.firstName.length() - other.firstName.length();
        if (diff != 0) {
            return -diff;
        }

        return -this.studentID.compareTo(other.studentID);
    }
}
