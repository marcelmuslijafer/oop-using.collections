package exercises.exercise1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Product> BY_PRICE = (p1, p2) -> p1.getPrice() - p2.getPrice();
        Set<Product> products = new TreeSet<>(BY_PRICE);


        ProductUtil.load(products);
        ProductUtil.printProducts(products);
    }
}
