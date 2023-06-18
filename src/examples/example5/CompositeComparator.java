package examples.example5;

import java.util.Comparator;
import java.util.List;

public class CompositeComparator<T> implements Comparator<T> {
    private List<Comparator<T>> comparators;

    public CompositeComparator(Comparator<T>... comparators) {
        for (Comparator<T> c : comparators) {
            this.comparators.add(c);
        }
    }

    @Override
    public int compare(T t1, T t2) {
        // BY_LAST_NAME, BY_FIRST_NAME, BY_ID
        for (Comparator<T> c : comparators) {
            int diff = c.compare(t1, t2);
            if (diff != 0) {
                return diff;
            }
        }
        return 0;
    }
}
