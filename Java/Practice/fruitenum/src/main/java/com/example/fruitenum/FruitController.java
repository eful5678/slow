package com.example.fruitenum;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
@CrossOrigin(origins = "http://localhost:8080")
@RequiredArgsConstructor
public class FruitController {

    private final FruitService fruitService;

    @GetMapping("/search")
    List<FruitDto.fruitList> fruitList(@ModelAttribute FruitDto.fruitListParam fruitListParam){
        return fruitService.fruitList(fruitListParam);
    }

    @GetMapping("/order")
    FruitDto.fruitOrder fruitOrder(@ModelAttribute FruitDto.fruitOrderParam fruitOrderParam) throws Exception {
        return fruitService.fruitOrder(fruitOrderParam);
    }

}
