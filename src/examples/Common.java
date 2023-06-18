package examples;

import java.util.Collection;

public class Common {
    public static <T> void printCollection(Iterable<T> col) {
        for (T element : col) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static <S extends Student> void fillStudentsCollection(Collection<S> col, StudentFactory<S> factory) {
        col.add(factory.create("Smith", "John", "1234567890"));
        col.add(factory.create("Johnson", "Emily", "0987654321"));
        col.add(factory.create("Brown", "Michael", "5678901234"));
        col.add(factory.create("Davis", "Emma", "4321098765"));
        col.add(factory.create("Miller", "Ethan", "9876543210"));
    }
}
