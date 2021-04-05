package com.serenitydojo.fruitmarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {

    private Map<Fruit, Double> pricePerKilo = new HashMap<>();

    public PriceSetter setPriceOf(Fruit fruit) {
        return new PriceSetter(this, fruit);
    }

    public Double getPriceOf(Fruit fruit) {
        try {
            if (pricePerKilo.containsKey(fruit)) {
                return pricePerKilo.get(fruit);
            } else {
                throw new FruitUnavailableException("Fruit unavailable.");
            }
        } catch (Exception exception){
            throw new FruitUnavailableException("Fruit unavailable.");
        }
    }

    public static class PriceSetter {
        private final Catalog catalog;
        private final Fruit fruit;

        public PriceSetter(Catalog catalog, Fruit fruit) {
            this.catalog = catalog;
            this.fruit = fruit;
        }

        public Catalog to(Double price) {
            catalog.pricePerKilo.put(fruit, price);
            return catalog;
        }
    }

    public List<String> listAvailableFruit(){
        List<String> listOfFruit = new ArrayList<>();
        for(Map.Entry<Fruit,Double> entry : pricePerKilo.entrySet()) {
            listOfFruit.add(entry.getKey().toString());
        }
        listOfFruit.sort(String.CASE_INSENSITIVE_ORDER);
        return listOfFruit;
    }
}
