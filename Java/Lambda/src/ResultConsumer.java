import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ResultConsumer {
    public static void main(String[] args) {

        Consumer<String> myStringConsumer = (String str) -> {
            System.out.println(str);
        };
        myStringConsumer.accept("hi");

        List<Integer> integerInputs = Arrays.asList(4, 2, 3);
        Consumer<Integer> myIntegerProcessor = (Integer x) -> {
            System.out.println("process" + x);
        };
        process(integerInputs, myIntegerProcessor);
    }

    public static void process(List<Integer> inputs, Consumer<Integer> processor){
        for(Integer input : inputs){
            processor.accept(input);
        }
    }
}
