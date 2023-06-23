package exercises.exercise1;

import java.util.Collection;

public class ProductUtil {

    public static void load(Collection<Product> col) {
        col.add(new Product("Barilla", 10));
        col.add(new Product("Zbregov jogurt", 2));
        col.add(new Product("Vanish", 5));
        col.add(new Product("Cokolino", 50));
    }

    public static void printProducts(Collection<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }
}
