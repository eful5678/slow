import java.util.function.BiFunction;

public class ResultBiFuntion {
    public static void main(String[] args) {
        System.out.println("hello");

        BiFunction<Integer, Integer, Integer> add = (Integer x, Integer y) -> {
            return x + y;
        };

        System.out.println(add);

        int result = add.apply(3, 5);

        System.out.println(result);

        BiFunction<Integer, Integer, Integer> add2 = (x, y) -> x + y;

        int result2 = add2.apply(5, 6);
        System.out.println(result2);
    }
}
