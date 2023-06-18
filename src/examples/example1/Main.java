package examples.example1;

import examples.Common;
import examples.Student;
import examples.StudentFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        StudentFactory<Student1> factory = (lastName, firstName, studentID) -> new Student1(lastName, firstName, studentID);

        Common.fillStudentsCollection(students, factory);
        Common.printCollection(students);

        Student1 s = new Student1("Brown", "Michael", "5678901234");
        System.out.println(s.getLastName() + " is present: " + students.contains(s));
        System.out.println();

        Set<Student1> setOfStudents = new HashSet<>();
        Common.fillStudentsCollection(setOfStudents, factory);
        Common.printCollection(setOfStudents);

        System.out.println(s.getLastName() + " is present: " + setOfStudents.contains(s));
    }
}
