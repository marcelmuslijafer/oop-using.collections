package examples.example5;

import examples.Common;
import examples.StudentFactory;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Student5> BY_LAST_NAME_LENGTH = (s1, s2) -> s1.getLastName().length() - s2.getLastName().length();
        Comparator<Student5> BY_FIRST_NAME_LENGTH = (s1, s2) -> s1.getFirstName().length() - s2.getFirstName().length();
        Comparator<Student5> BY_ID = (s1, s2) -> s1.getStudentID().compareTo(s2.getStudentID());

        Comparator<Student5> COMPOSITE_COMPARATOR = BY_LAST_NAME_LENGTH
                .thenComparing(BY_FIRST_NAME_LENGTH)
                .thenComparing(BY_ID);

        CompositeComparator<Student5> MY_COMPOSITE_COMPARATOR = new CompositeComparator<>(
                BY_LAST_NAME_LENGTH,
                BY_FIRST_NAME_LENGTH,
                BY_ID);

        Set<Student5> students = new TreeSet<>(COMPOSITE_COMPARATOR);
        StudentFactory<Student5> factory = (lastName, firstName, studentID) -> new Student5(lastName, firstName, studentID);

        Common.fillStudentsCollection(students, factory);
        Common.printCollection(students);
    }
}
