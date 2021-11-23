package com.example.fruitenum;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class FruitRepository {

    List<FruitDto.fruitList> fruitList(FruitDto.fruitListParam fruitListParam){

        List<FruitEnum> fruitList = Stream.of(FruitEnum.values())
                .collect(Collectors.toList());

        FruitDto.fruitList fruits = new FruitDto.fruitList();

//        List<FruitDto.fruitList> fruitList2 = fruitList.stream()
//                .forEach(x -> new FruitDto.fruitList(x.name,x.price,x.discount,x.quantity));

        List<FruitDto.fruitList> fruitList3 = fruitList.stream()
                .map(x -> new FruitDto.fruitList(x.name, x.price, x.discount, x.quantity))
                .collect(Collectors.toList());

        return fruitList3;
    }

    FruitDto.fruitOrder fruitOrder(FruitDto.fruitOrderParam fruitOrderParam){
        return null;
    }
}
