package com.example.func;

public class FuncApplication {
    public static void main(String[] args) {
        // 익명 내부 클래스
        RunSomething runSomething = (number) -> {
            return number + 10;
        };
        System.out.println(11);

        System.out.println(runSomething.doIt(1));
    }
}
