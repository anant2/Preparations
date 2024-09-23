package functional_programming.partone;

import java.util.List;

public class PrintSquareAndSum {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        int result = printSquareAndSumOfSquares(numbersList);
        System.out.println(result);
    }

    private static int printSquareAndSumOfSquares(List<Integer> numbersList) {
        return numbersList.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);
    }

}
