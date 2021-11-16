import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /**
         * 비즈니스 정의
         * 과일을 주문하고, 재고 여부를 파악하여 주문의 가능 여부 및 총 가격을 반환한다
         * 
         * Enum 클래스에 과일에 대한 이름, 수량, 가격 등의 정보를 넣는다
         */

        // 1. 전체 과일 목록을 가져온다

        // Stream.of ->
        // Enum을 사용하는 이유?
        // Enum values()의 정의
        List<FruitEnum> fruitList = Stream.of(FruitEnum.values())
                                    .collect(Collectors.toList());
        System.out.println(fruitList);

        // 2. 주문한 과일이 존재하는지 파악하여 존재하는 과일 목록을 가져온다
        
        // 3. 가져온 목록에서 주문한 수량과 해당 과일의 재고를 비교하여 
        // 주문이 가능하다면 주문한 총액을 반환하고
        // 주문이 불가하다면 예외를 떨군다
        }
}
