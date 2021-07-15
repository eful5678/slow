package com.example.func;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {

    public static void main(String[] args) {
        // 익명 내부 클래스
//        RunSomething runSomething = (number) -> {
//            return number + 10;
//        };
//        System.out.println(11);
//
//        System.out.println(runSomething.doIt(1));

        // Function
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus20 = (i) -> i+10;
        System.out.println(plus20.apply(2));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(multiply2.apply(3));

//        System.out.println(plus20.compose(multiply2));
        Function<Integer, Integer> plus_Mul = plus20.compose(multiply2);
        System.out.println(plus_Mul.apply(5));

        Function<Integer, Integer> go = plus20.andThen(multiply2);
        System.out.println(go.apply(5));

        // Consumer
        Consumer<Integer> printC = (i) -> System.out.println(i);
        printC.accept(10);

        // Supplier
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        // Predicate
        Predicate<String> startsWith = (s) -> s.startsWith("jin");
        System.out.println(startsWith.test("Kim"));

        Predicate<Integer> isEven = (i) -> i%2 == 0;
        System.out.println(isEven.test(5));





    }


}
