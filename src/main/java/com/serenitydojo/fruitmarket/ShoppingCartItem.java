package com.serenitydojo.fruitmarket;

public class ShoppingCartItem {
    private Fruit fruit;
    private Double quantity;
    private Double totalCost;
    private static Double VOLUME_DISCOUNT = 0.1;

    public ShoppingCartItem(Fruit fruit, Double quantity, Double totalCost) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getTotalCost() {

        return quantity > 5.00 ? totalCost * (1 - VOLUME_DISCOUNT) : totalCost;
    }
}
