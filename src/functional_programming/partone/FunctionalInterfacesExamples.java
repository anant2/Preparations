package functional_programming.partone;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesExamples {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        //getAllSquaresOfEvenNumbers(numbersList);
        //getAllSquaresOfEvenNumbers2(numbersList);
        getAllSquaresOfEvenNumbers3(numbersList);
    }

    static Predicate<Integer> isEvenPredicate = new Predicate<Integer>() {
        @Override
        public boolean test(Integer number) {
            return number % 2 == 0;
        }
    };

    static Function<Integer, String> squareFunction = new Function<Integer, String>() {
        @Override
        public String apply(Integer integer) {
            return integer * integer + " ";
        }
    };

    static Consumer<String> printFunction = new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.print(s);
        }
    };

    private static void getAllSquaresOfEvenNumbers3(List<Integer> numbersList) {
        numbersList.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(printFunction);
    }

    private static void getAllSquaresOfEvenNumbers2(List<Integer> numbersList) {
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        Function<Integer, String> squareFunction = number -> number * number + " ";
        Consumer<String> printFunction = number -> System.out.print(number);
        numbersList.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(printFunction);
    }

    private static void getAllSquaresOfEvenNumbers(List<Integer> numbersList) {
         numbersList.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number + " ")
                .forEach(System.out::print);
    }

}
