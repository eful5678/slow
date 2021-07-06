package me.whiteship.java8;

public class Foo {
    public static void main(String[] args) {
        // anonymous class
        RunSomething runSomething = () -> System.out.println("hello");
    }
}
