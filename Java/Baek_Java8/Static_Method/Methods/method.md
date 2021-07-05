```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<String> names = new ArrayList<>();
        names.add("Jin");
        names.add("Kim");
        names.add("Toby");
        names.add("Son");

        names.forEach(System.out::println);

        long k = names.stream().map(String::toUpperCase).filter(s -> s.startsWith("K")).count();

        names.stream().map(String::toUpperCase).filter(s -> s.startsWith("K")).collect(Collectors.toSet());

        System.out.println(k);

        System.out.println("==========");

        List<String> collect = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("==============");
    }
}

```