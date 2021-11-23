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
        return fruitRepository.fruitList(fruitListParam);
    }

    FruitDto.fruitOrder fruitOrder(FruitDto.fruitOrderParam fruitOrderParam){
        Predicate<FruitDto.fruitOrder> checkQuantity = x -> x.getFruitQuantity() < fruitOrderParam.getQuantity();
//        if(checkQuantity.test()){
//
//        }
        return fruitRepository.fruitOrder(fruitOrderParam);
    }

}
