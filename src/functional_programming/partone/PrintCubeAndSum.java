package functional_programming.partone;

import java.util.List;

public class PrintCubeAndSum {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        int result = printCubeAndSumOfCubes(numbersList);
        System.out.println(result);
    }

    private static int printCubeAndSumOfCubes(List<Integer> numbersList) {
        return numbersList.stream()
                .map(num -> (int) Math.pow(num, 3))
                .reduce(0, Integer::sum);
    }

}
