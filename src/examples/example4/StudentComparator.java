package examples.example4;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student4> {

    @Override
    public int compare(Student4 s1, Student4 s2) {
        int diff = s1.getLastName().length() - s2.getLastName().length();
        if (diff != 0) {
            return diff;
        }

        diff = s1.getFirstName().length() - s1.getFirstName().length();
        if (diff != 0) {
            return diff;
        }

        return s1.getStudentID().compareTo(s2.getStudentID());
    }
}
