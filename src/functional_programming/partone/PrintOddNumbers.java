package functional_programming.partone;

import java.util.List;

public class PrintOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        printOddNumbersStructured(numbersList);
    }

    private static void printOddNumbersStructured(List<Integer> numbersList) {
        numbersList.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

}
