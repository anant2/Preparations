package functional_programming.partone;

import java.util.function.*;

public class BiExamples {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> result = (x,y) -> x > 1 && y < 10;
        System.out.println(result.test(2, 4));
        System.out.println(result.test(1, 4));

        BiFunction<String, String , String> result1 = (x , y) -> x +" "+y;
        System.out.println(result1.apply("Anant", "Majhi"));

        BiConsumer<String, String> result2 = (x , y) -> System.out.println("The full name is "+x +" "+y);
        result2.accept("Anant", "Majhi");

        IntPredicate result3 = (x) ->  x > 0;
        System.out.println(result3.test(-5));


    }

}
