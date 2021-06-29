package com.example.java8to11;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Foo {

    private static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner Class
        // RunSomething runSomething = new RunSomething(){

        // @Override
        // public void doIt() {
        // // TODO Auto-generated method stub

        // }

        // };

        RunSomething runSomething = () -> {

        };

        BinaryOperator<Integer> sum = (a, b) -> a + b;

        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}
