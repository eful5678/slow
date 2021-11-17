import java.util.List;
import java.util.function.Predicate;
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

        /**
         * lazy
         * to defer an action until it becomes necessary
         * if the result of the action is never used, the action will never be carried out
         * 이름으로 함수를 호출하거나 필요할 때 호출
         * 어떠한 계산이 결과가 필요할 때까지 계산을 눚추는 기법
         * 수식이 변수에 접근할 때 계산되지 않고, 강제로 계산값을 출력하라고 할 때까지 계산을 늦춘다
         */

        // 1. 전체 과일 목록을 가져온다

        // Stream -> 함수형 오퍼레이션을 위해 사용
        // Collection에서 MapReduce Transformation과 같은....?
        // MapReduece -> 데이터가 많을 때 분산화하고 평행화된 프로세스를 수행하기 위한 방법
        // Map process와 Reduce process로 구성
        // Filtering과 Sorting
        // Collection 의 stream() 이용
        // Arrays.stream() 이용
        // Stream.of() 이용
        // Enum을 사용하는 이유?
        // Enum values()의 정의

        //Stream.of()를 이용한 방법
        // 값이 Object형태일 때 사용할 수 있다
        // Intermediate Opreation: 새로운 stream을 리턴한다, 항상 lazy하다?? 실제 값 자체를 filtering하는 것은 아니고 새로운 stream을 만드는 것
        // -> filter, map
        // Terminal Operation:  -> forEach, reduce
        // Collectors -> 요소들을 Collection에 담거나 다양한 조건에 따라 요소들을 모은다
        // toList -> 투입된 요소들을 List형태로 반환
        List<FruitEnum> fruitList = Stream.of(FruitEnum.values())
                                    .collect(Collectors.toList());
        System.out.println(fruitList);

        // Collection에서 stream() 이용
        List<FruitEnum> fruitList2 = fruitList.stream()
                                    .collect(Collectors.toList());

        // 2. 주문할 과일들의 이름과 수량을 정한다
        // 일단 Object 형태로 함, 일단 새로운 자료구조 보다 기존 프로젝트에서 사용하던 방식으로 해야할 듯
        // 여러 과일을 주문받는 방식을 고민해봐야하는데 소스참고를 해야할듯..
        orderDto.orderRequest orderedFruit = new orderDto.orderRequest();
        orderedFruit.setName("사과");
        orderedFruit.setQuantity(5);



        // 3. 주문한 과일이 존재하는지 파악하여 존재하는 과일 목록을 가져온다

        // 일단 순차적으로 먼저,, 주문한 과일의 이름이랑 매치되는 과일을 enum 과일목록에서 가져와 매치되는 것만 리스트로 반환
        List<FruitEnum> orderedFruitList = fruitList.stream()
                                                .filter(x -> x.name.equals(orderedFruit.getName()))
                                                .collect(Collectors.toList());
        System.out.println(orderedFruitList);
        
        // 3. 가져온 목록에서 주문한 수량과 해당 과일의 재고를 비교하여 
        // 주문이 가능하다면 주문한 총액을 반환하고
        // 주문이 불가하다면 예외를 떨군다

        // Boolean 대신 Predicate를 쓰는 이유는 무엇일까?
        // Predicate.test()

        // Predicate<FruitEnum> checkQuantity = fruitList.stream()
        //                                         .filter(x -> x.quantity < orderedFruit.getQuantity())
        //                                         .;

        Predicate<FruitEnum> checkQuantity = x -> x.quantity < orderedFruit.getQuantity();

        System.out.println(checkQuantity);

        if(test(checkQuantity)){
            
        }
                                                
        
        // if(checkQuantity.test()){
        //     //총액을 구한다
        // }else{
        //     throw new Exception("재고 수량이 부족합니다...");
        // }
        }
}
