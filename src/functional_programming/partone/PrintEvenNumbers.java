package functional_programming.partone;

import java.util.List;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        printEvenNumbersStructured(numbersList);
        System.out.println();
        System.out.println("---------------------");
        printEvenNumbersFunctional(numbersList);
    }

    public static boolean filterEvenNumbers(int number) {
        return (number % 2 == 0);
    }

    private static void printEvenNumbersFunctional(List<Integer> numbersList) {
//        numbersList.stream()
//                .filter(PrintEvenNumbers::filterEvenNumbers)
//                .forEach(System.out::println);

        numbersList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printEvenNumbersStructured(List<Integer> numbersList) {
        for (int number : numbersList) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }

}
