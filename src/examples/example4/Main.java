package examples.example4;

import examples.Common;
import examples.StudentFactory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student4> students = new TreeSet<>(new StudentComparator());
        // Comparator<Student4> comparator = (s1, s2) -> s1.getStudentID().compareTo(s2.getStudentID());
        StudentFactory<Student4> factory = (lastName, firstName, studentID) -> new Student4(lastName, firstName, studentID);

        Common.fillStudentsCollection(students, factory);
        Common.printCollection(students);

        Comparator<Student4> lastNameComparator = (s1, s2) -> s1.getLastName().compareTo(s2.getLastName());
        Set<Student4> studentsByLastName = new TreeSet<>(lastNameComparator.reversed());
        Common.fillStudentsCollection(studentsByLastName, factory);
        Common.printCollection(studentsByLastName);
    }
}
