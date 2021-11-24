package com.example.fruitenum;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
@RequiredArgsConstructor
public class FruitService {

    private final FruitRepository fruitRepository;

    List<FruitDto.fruitList> fruitList(FruitDto.fruitListParam fruitListParam){
        List<FruitDto.fruitList> list = fruitRepository.fruitList(fruitListParam);
        return list;
    }
//    FruitDto.fruitOrder fruitOrder(FruitDto.fruitOrderParam fruitOrderParam){
//        return null;
//    }

    FruitDto.fruitOrder fruitOrder(FruitDto.fruitOrderParam fruitOrderParam) throws Exception {
        FruitDto.fruitOrder orderedFruit = fruitRepository.orderList(fruitOrderParam);
        Predicate<FruitDto.fruitOrder> checkQuantity = x -> x.getFruitQuantity() < fruitOrderParam.getQuantity();

        if(checkQuantity.test(orderedFruit)){
            throw new Exception("주문 수량이 부족합니다.");
        }else{
            // 주문 성공
            System.out.println("성공");
            return orderedFruit;
        }
    }

}
