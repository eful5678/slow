package com.example.fruitenum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class FruitDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class fruitList{

        private String fruitName;

        private Integer fruitPrice;

        private Integer fruitDiscount;

        private Integer fruitQuantity;

        public fruitList(String fruitName,
                         Integer fruitPrice,
                         Integer fruitDiscount,
                         Integer fruitQuantity){
            this.fruitName = fruitName;
            this.fruitPrice = fruitPrice;
            this.fruitDiscount = fruitDiscount;
            this.fruitQuantity = fruitQuantity;
        }

    }

    @Getter
    @Setter
    public static class fruitOrder{
        private String fruitName;

        private int fruitQuantity;

        private int fruitPrice;

        public fruitOrder(String fruitName,
                          int fruitQuantity,
                          int fruitPrice){
            this.fruitName = fruitName;
            this.fruitQuantity = fruitQuantity;
            this.fruitPrice = fruitPrice;
        }

    }

    @Getter
    @Setter
    public static class fruitListParam{

    }

    @Getter
    @Setter
    public static class fruitOrderParam{
        private String name;

        private int quantity;
    }
}
