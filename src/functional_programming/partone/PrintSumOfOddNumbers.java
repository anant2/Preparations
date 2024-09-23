package functional_programming.partone;

import java.util.List;

public class PrintSumOfOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        int result = printSumOfOddNumbers(numbersList);
        System.out.println(result);
    }

    private static int printSumOfOddNumbers(List<Integer> numbersList) {

        return numbersList.stream()
                .filter(num -> num % 2 == 1)
                .reduce(0, Integer::sum);

    }

}
