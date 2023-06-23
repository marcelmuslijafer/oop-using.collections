package examples.example4;

import examples.Common;
import examples.StudentFactory;
import examples.example3.Student3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student4> students = new TreeSet<>(new StudentComparator());
        StudentFactory<Student4> factory = (lastName, firstName, studentID) -> new Student4(lastName, firstName, studentID);

        Common.fillStudentsCollection(students, factory);
        Common.printCollection(students);

        Comparator<Student4> BY_JMBAG = (s1, s2) -> s1.getStudentID().compareTo(s2.getStudentID());
        Comparator<Student4> BY_LASTNAME = (s1,s2) -> s1.getLastName().compareTo(s2.getLastName());

        Set<Student4> studentsByLastName = new TreeSet<>(BY_LASTNAME.reversed());
        Common.fillStudentsCollection(studentsByLastName, factory);
        Common.printCollection(studentsByLastName);

        Set<Student3> s = new TreeSet<>((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));
        Common.fillStudentsCollection(s, (lastName, firstName, studentID) -> new Student3(lastName, firstName, studentID));
        Common.printCollection(s);
    }
}
