import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App_Greeting {

    public static void main(String[] args) {

        Greeting greeting = new Greeting();

        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("Jin"));

        Function<String, Greeting> Jin = Greeting::new;
        System.out.println(Jin.apply("Kim"));

        Greeting hi = Jin.apply("HJ Kim");
        System.out.println(hi.getName());

        Supplier<Greeting> newGreeting = Greeting::new;

    }
}
