package functional_programming.partone;

import java.util.List;
import java.util.function.BinaryOperator;

public class PrintSumOfNumbers {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        //int result = printSumOfAllNumbers(numbersList);
        //int result = printSumOfAllNumberFunctional(numbersList);
        int result = printSumOfAllNumberFunctional2(numbersList);

        System.out.println(result);
    }

    static BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer integer1, Integer integer2) {
            return integer1 + integer2;
        }
    };

    private static int printSumOfAllNumberFunctional2(List<Integer> numbersList) {
        return numbersList.stream()
                .reduce(0, sum);
    }

    private static int printSumOfAllNumberFunctional(List<Integer> numbersList) {
        BinaryOperator<Integer> sum = Integer::sum;
        return numbersList.stream()
                .reduce(0, sum);
    }

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    private static int printSumOfAllNumbers(List<Integer> numbersList) {

//        return numbersList.stream()
//                .reduce(0, PrintSumOfNumbers::addTwoNumbers);

//        return numbersList.stream()
//                .reduce(0, (x, y) -> x + y);

        return numbersList.stream()
                .reduce(0, Integer::sum);

    }

}
