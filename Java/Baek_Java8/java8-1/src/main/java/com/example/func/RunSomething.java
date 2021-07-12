package com.example.func;

@FunctionalInterface // 함수형 인터페이스 원칙 위반시 오류 나타내줌
public interface RunSomething {
    // 추상 메서드가 1개인 인터페이스 -> 함수형 인터페이스

    // 추상메서드 <- abstract는 생략가능
    int doIt(int a);

    // static 메서드는 추가 가능
    static void printName(){
        System.out.println("jin");
    }

    // default 메서드도 정의가능
    default void printAge(){
        System.out.println("32");
    }
}
