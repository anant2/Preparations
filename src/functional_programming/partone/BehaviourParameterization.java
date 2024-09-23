package functional_programming.partone;

import java.util.List;
import java.util.function.Predicate;

public class BehaviourParameterization {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        filterAndPrint(numbersList, evenPredicate);
        System.out.println();
        System.out.println("---------");
        filterAndPrint(numbersList, oddPredicate);
        System.out.println();
        System.out.println("-----------");
        filterAndPrint(numbersList, multipleOfThreePredicate);
    }

    static Predicate<Integer> evenPredicate = num -> num % 2 == 0;
    static Predicate<Integer> oddPredicate = num -> num % 2 == 1;
    static Predicate<Integer> multipleOfThreePredicate = num -> num % 3 == 0;

    private static void filterAndPrint(List<Integer> numbersList, Predicate<Integer> predicate) {
        numbersList.stream()
                .filter(predicate)
                .map(num -> num + " ")
                .forEach(System.out::print);
    }

}
