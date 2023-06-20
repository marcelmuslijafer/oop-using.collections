package examples.example2;

import examples.Common;
import examples.StudentFactory;
import examples.example1.Student1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student2> students = new HashSet<>();
        StudentFactory<Student2> factory = (lastName, firstName, studentID) -> new Student2(lastName, firstName, studentID);

        Common.fillStudentsCollection(students, factory);
        Common.printCollection(students);

        Student2 s = new Student2("Brown", "Michael", "5678901234");
        System.out.println(s.getLastName() + " is present: " + students.contains(s));

        Set<Student2> treeSetOfStudents = new TreeSet<>();
        Common.fillStudentsCollection(treeSetOfStudents, factory);
        Common.printCollection(treeSetOfStudents);
    }
}
