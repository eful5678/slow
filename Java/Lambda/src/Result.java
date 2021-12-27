import util.Adder;

import java.util.function.Function;

public class Result {
    public static void main(String[] args) {
        System.out.println("Hello");

        Function<Integer, Integer> myAdder = new Adder();
        int result = myAdder.apply(10);

        System.out.println(result);

        Function<Integer, Integer> myAdder2 = (Integer x) -> {
            return x + 20;
        };

        int result2 = myAdder2.apply(10);

        System.out.println(result2);

        Function<Integer, Integer> myAdder3 = x -> x + 30;
        int result3 = myAdder3.apply(10);

        System.out.println(result3);
    }
}
