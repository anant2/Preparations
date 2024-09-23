package functional_programming.partone;

import java.util.List;

public class PrintSquareOfNumbers {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        printSquareOfList(numbersList);
        System.out.println("-------------");
        printCubesOfOddNumbers(numbersList);
    }

    // print cubes of odd numbers
    private static void printCubesOfOddNumbers(List<Integer> numbersList) {
        numbersList.stream()
                .filter(number -> number%2 == 1)
                .map(number -> (int) Math.pow(number, 3))
                .forEach(System.out::println);
    }

    private static void printSquareOfList(List<Integer> numbersList) {
        numbersList.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }


}
