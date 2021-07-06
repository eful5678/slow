package me.whiteship.java8;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App_Greeting {
    public static void main(String[] args) {

        Greeting greeting = new Greeting();

        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("Jin"));
        System.out.println("=====");

        Function<String, Greeting> Jin = Greeting::new;
        System.out.println(Jin.apply("Kim"));
        System.out.println("=====");

        Greeting hi = Jin.apply("Kim Hyun Jin");
        System.out.println(hi.getName());

        Supplier<Greeting> newGreeting = Greeting::new;
        System.out.println(newGreeting.get());
    }
}
