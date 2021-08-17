import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Func {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Seoul", "Tokyo", "New York", "Frankfurt", "Shanghai");

        List<String> cityWithS = cities.stream() // stream 생성
                .filter(city -> city.startsWith("S")) // filter를 통해 S로 시작하는 문자열 걸러내기
                // Stream<T> filter(Predicate<? super T> predicate);

                .collect(Collectors.toList());
        System.out.println(cityWithS);
    }
}
