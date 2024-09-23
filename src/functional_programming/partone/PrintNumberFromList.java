package functional_programming.partone;

import java.util.List;

public class PrintNumberFromList {

    public static void main(String[] args) {
        printNumbersStructured(List.of(1,4,12,42,5,3,2,4,6,89));
        System.out.println();
        System.out.println("---------------------");
        printNumbersFunctional(List.of(1,4,12,42,5,3,2,4,6,89));
    }

    public static void display(int number) {
        System.out.print(number+" ");
    }

    private static void printNumbersFunctional(List<Integer> numbers) {
        //numbers.stream().forEach(PrintNumberFromList::display);
        //numbers.stream().forEach(System.out::println);
        numbers.stream()
                .map(number -> number+" ")
                .forEach(System.out::print);
    }

    private static void printNumbersStructured(List<Integer> numbers) {
        for(int number : numbers) {
            System.out.print(number+ " ");
        }
    }

}
