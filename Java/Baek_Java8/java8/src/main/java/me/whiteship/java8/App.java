package me.whiteship.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("jin");
        names.add("kim");
        names.add("hyun");
        names.add("good");
        System.out.println("==========");

        long k = names.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("K"))
                .count();
        System.out.println(k);
        System.out.println("=====");

        names.removeIf(s -> s.startsWith("j"));

        Stream<String> stringStream = names.stream().map(String::toUpperCase);
        stringStream.forEach(System.out::println);
        System.out.println("=====");

        List<String> collect = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println("collect : " + collect);
        collect.forEach(System.out::println);
        System.out.println("=====");

        names.forEach(System.out::println);
    }
}
