package examples.example5;

import examples.Student;
import examples.example4.Student4;

public class Student5 extends Student4 {

    // Student5 ne implementira comparable
    private Student5 bestFriend = new Student5("Juras", "Klara", "123");

    public Student5(String lastName, String firstName, String studentID) {
        super(lastName, firstName, studentID);
    }

    public Student5 getBestFriend() {
        return bestFriend;
    }
}
