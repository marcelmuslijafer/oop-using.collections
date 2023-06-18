package examples;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        StudentFactory<Student> factory = (lastName, firstName, studentID) -> new Student(lastName, firstName, studentID);

        Common.fillStudentsCollection(students, factory);
        Common.printCollection(students);

        Student s = new Student("Brown", "Michael", "5678901234");
        System.out.println(s.getLastName() + " is present: " + students.contains(s));
        System.out.println(students.lastIndexOf(s));
        System.out.println(students.indexOf(s));
    }
}
