package com.example.fruitenum;

public enum FruitEnum {
    APPLE("사과", 4000, 400, 5),
    PINEAPPLE("파인애플", 12000, 600, 5),
    GRAPEFRUIT("자몽", 5600, 400, 3);

    String name;
    Integer price;
    Integer discount;
    Integer quantity;
    private FruitEnum(String name, Integer price, Integer discount, Integer quantity) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
    }
}
