package functional_programming.partone;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviourParameterizationExercise {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 4, 12, 42, 5, 3, 2, 4, 6, 89);
        List<Integer> squaresOfNumbers = computeAndReturn(numbersList, squareFunction);
        System.out.println(squaresOfNumbers);

        List<Integer> cubeOfNumbers = computeAndReturn(numbersList, cubeFunction);
        System.out.println(cubeOfNumbers);

        List<Integer> doubleNumbers = computeAndReturn(numbersList, doubleFunction);
        System.out.println(doubleNumbers);
    }

    static Function<Integer, Integer> squareFunction = num -> num * num;
    static Function<Integer, Integer> cubeFunction = num -> num * num * num;
    static Function<Integer, Integer> doubleFunction = num -> num + num;


    private static List<Integer> computeAndReturn(List<Integer> numbersList, Function<Integer, Integer> function) {
        return numbersList.stream()
                .map(function)
                .collect(Collectors.toList());
    }

}
