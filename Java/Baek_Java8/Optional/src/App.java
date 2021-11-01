import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        System.out.println("dd");

        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        // filter로 가져오는 값이 있을수도, 없을수도 있기 때문에 Optional로 리턴을 받는다.
        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        Optional<OnlineClass> jpa = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("jpa"))
                .findFirst();

        // 존재 여부를 참 거짓으로 받는다.
        boolean present = spring.isPresent();
        System.out.println(present);

        OnlineClass onlineClass1 = spring.get();
        System.out.println(onlineClass1.getTitle());

        // get 사용 x
        spring.ifPresent(oc -> System.out.println(oc.getTitle()));

        OnlineClass onlineClass2 = jpa.orElse(createNewJpaClass());
        System.out.println(onlineClass2.getTitle());

        OnlineClass onlineClass3 = jpa.orElseGet(() -> createNewJpaClass());
        System.out.println(onlineClass3.getTitle());

//        OnlineClass onlineClass4 = jpa.orElseThrow(() -> {
//            return new IllegalArgumentException();
//        });

        Optional<OnlineClass> onlineClass5 = spring
                .filter(oc -> oc.getId() > 10);
        System.out.println(onlineClass5.isPresent());


//        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
//        Duration studyDuration = spring_boot.getProgress().getStudyDuration();
//        System.out.println(studyDuration);
    }

    private static OnlineClass createNewJpaClass() {
        System.out.println("new class gogo");
        return new OnlineClass(10, "new class", false);
    }
}
