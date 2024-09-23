package functional_programming.partone;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierAndUnaryInterfaces {

    public static void main(String[] args) {

        Supplier<Integer> randomNumbers = () -> {
            Random rand = new Random();
            return rand.nextInt(100);
        };

        System.out.println(randomNumbers.get());

        UnaryOperator<Integer> value = val -> {
            return val * 10;
        };

        System.out.println(value.apply(3));

    }

}
