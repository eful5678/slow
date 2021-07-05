```java
//App.java

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}

// Foo.java

public class Foo {

    public static void main(String[] args) {

        Foo foo = new Foo();

        foo.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }

        // 익명클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}

// Greeting.java

public class Greeting {

    private String name;

    public Greeting() {

    }

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String hello(String name) {
        return "hello " + name;
    }

    public static String hi(String name) {
        return "hi " + name;
    }
}

// App_Greeting.java

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

```


