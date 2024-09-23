package java8.lambdas;

import java.util.Comparator;
import java.util.function.Function;

public class ComparatorInterface {

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(8,4));

        Comparator<Integer> comparator1 = (o1, o2) ->  o1.compareTo(o2);
        System.out.println(comparator1.compare(7,7));
    }

}
