package examples.example3;

import examples.Common;
import examples.StudentFactory;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student3> students = new TreeSet<>();
        StudentFactory<Student3> factory = (lastName, firstName, studentID) -> new Student3(lastName, firstName, studentID);

        Common.fillStudentsCollection(students, factory);
        Common.printCollection(students);
    }
}
