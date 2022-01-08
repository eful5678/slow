import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ResultPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (Integer x) -> {
            return x > 0;
        };

        Predicate<Integer> isPositive2 = x -> x > 0;

        System.out.println(isPositive2.test(3));

        List<Integer> inputs = Arrays.asList(-1, 0, 1, 2);


        System.out.println("Positive Nr: " + filter(inputs, isPositive2));
        System.out.println("Non-Positive Nr: " + filter(inputs, isPositive2.negate()));
        System.out.println("Non-Negative Nr: " + filter(inputs, isPositive2.
                or(x -> x == 0)));
        System.out.println("Even-Positive Nr: " + filter(inputs, isPositive2
                .and(x -> x%2 == 0)));
    }

    public static <T> List<T> filter(List<T> inputs, Predicate<T> condition){
        List<T> output = new ArrayList<>();
        for(T input:inputs){
            if(condition.test(input)){
                output.add(input);
            }
        }
        return output;
    }
}
