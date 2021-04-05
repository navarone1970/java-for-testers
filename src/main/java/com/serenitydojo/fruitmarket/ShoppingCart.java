package com.serenitydojo.fruitmarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private final Catalog catalog;
    private final List<ShoppingCartItem> items;

    public ShoppingCart(Catalog catalog) {
        this.catalog = catalog;
        this.items = new ArrayList<>();
    }

    public void addItem(ShoppingCartItem shoppingCartItem) {
        items.add(shoppingCartItem);
    }

    public double totalValueOfCart() {
        double totalValueOfCart = 0.0;
        for (ShoppingCartItem item : items) {
            totalValueOfCart = totalValueOfCart + item.getTotalCost();
        }
        return totalValueOfCart;
    }

    public ShoppingCartItem getItem(Fruit fruit) {
        for (ShoppingCartItem item : items) {
            if (item.getFruit() == fruit)
                return item;
        }
        return null;
    }


    public Map<Fruit, Double> listOfItems() {
        Map<Fruit, Double> listOfItems = new HashMap<>();
        for (ShoppingCartItem item : items) {
            listOfItems.put(item.getFruit(), item.getQuantity());
        }
        return listOfItems;
    }
}

