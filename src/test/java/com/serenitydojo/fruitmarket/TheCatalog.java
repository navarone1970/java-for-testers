package com.serenitydojo.fruitmarket;

import org.junit.Test;

import static com.serenitydojo.fruitmarket.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TheCatalog {

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        Catalog catalog = new Catalog();

        catalog.setPriceOf(Apple).to(4.00);
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);
    }

    @Test
    public void reportThePriceOfAGivenTypeOfFruit() {

        // Ok, this replicates the first test, but it's important to have it stated explicitly as a test.
        // GIVEN
        Catalog catalog = new Catalog();
        // WHEN
        catalog.setPriceOf(Banana).to(6.00);
        // THEN
        assertThat(catalog.getPriceOf(Banana)).isEqualTo(6.00);
    }

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruitThatAlreadyHasAPriceSet() {

        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00);

        // WHEN
        catalog.setPriceOf(Apple).to(5.00);

        // THEN
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(5.00);
    }

    @Test
    public void listAvailableFruitInAlphabeticalOrderFromCatalogWithOneItem(){

        // GIVEN
        Catalog catalog = new Catalog();
        // WHEN
        catalog.setPriceOf(Strawberries).to(6.00);

        // THEN
       assertThat(catalog.listAvailableFruit()).containsExactly("Strawberries");
    }

    @Test
    public void listAvailableFruitInAlphabeticalOrderFromCatalogWithMultipleItems(){

        // GIVEN
        Catalog catalog = new Catalog();
        // WHEN
        catalog.setPriceOf(Banana).to(6.00);
        catalog.setPriceOf(Apple).to(4.00);
        catalog.setPriceOf(Strawberries).to(6.00);
        catalog.setPriceOf(Peach).to(4.00);
        catalog.setPriceOf(Mulberries).to(4.00);

        // THEN
        assertThat(catalog.listAvailableFruit()).containsExactly("Apple","Banana","Mulberries","Peach","Strawberries");
    }

    @Test
    public void listAvailableFruitInAlphabeticalOrderFromUpdatedCatalog(){

        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Banana).to(6.00);
        catalog.setPriceOf(Apple).to(4.00);

        // WHEN
        catalog.setPriceOf(Strawberries).to(6.00);
        catalog.setPriceOf(Peach).to(4.00);

        // THEN
        assertThat(catalog.listAvailableFruit()).containsExactly("Apple","Banana","Peach","Strawberries");
    }

    @Test
    public void addSingleItemToShoppingCart(){

        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Orange).to(5.50);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);

        // WHEN
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem(Orange,1.50,catalog.getPriceOf(Orange)*1.5);
        shoppingCart.addItem(shoppingCartItem);

        // THEN
        assertThat(shoppingCart.getItem(Orange).getFruit()).isEqualTo(Orange);
        assertThat(shoppingCart.getItem(Orange).getQuantity()).isEqualTo(1.50);
        assertThat(shoppingCart.getItem(Orange).getTotalCost()).isEqualTo(8.25);
    }

    @Test
    public void addMultipleItemsToShoppingCart(){

        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Orange).to(5.50);
        catalog.setPriceOf(Pear).to(4.50);
        catalog.setPriceOf(Apple).to(4.00);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);

        // WHEN
        ShoppingCartItem shoppingCartItem1 = new ShoppingCartItem(Orange,1.50,catalog.getPriceOf(Orange)*1.50);
        ShoppingCartItem shoppingCartItem2 = new ShoppingCartItem(Pear,2.00,catalog.getPriceOf(Pear)*2.00);
        ShoppingCartItem shoppingCartItem3 = new ShoppingCartItem(Apple,2.50,catalog.getPriceOf(Apple)*2.50);
        shoppingCart.addItem(shoppingCartItem1);
        shoppingCart.addItem(shoppingCartItem2);
        shoppingCart.addItem(shoppingCartItem3);

        // THEN
        assertThat(shoppingCart.getItem(Orange).getFruit()).isEqualTo(Orange);
        assertThat(shoppingCart.getItem(Orange).getQuantity()).isEqualTo(1.50);
        assertThat(shoppingCart.getItem(Orange).getTotalCost()).isEqualTo(8.25);
        assertThat(shoppingCart.getItem(Pear).getFruit()).isEqualTo(Pear);
        assertThat(shoppingCart.getItem(Pear).getQuantity()).isEqualTo(2.00);
        assertThat(shoppingCart.getItem(Pear).getTotalCost()).isEqualTo(9.00);
        assertThat(shoppingCart.getItem(Apple).getFruit()).isEqualTo(Apple);
        assertThat(shoppingCart.getItem(Apple).getQuantity()).isEqualTo(2.50);
        assertThat(shoppingCart.getItem(Apple).getTotalCost()).isEqualTo(10.00);
    }

    @Test
    public void getValueOfCartAfterAddingASingleItemToShoppingCart(){

        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Orange).to(5.50);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);

        // WHEN
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem(Orange,1.50,catalog.getPriceOf(Orange)*1.5);
        shoppingCart.addItem(shoppingCartItem);

        // THEN
        assertThat(shoppingCart.totalValueOfCart()).isEqualTo(8.25);
    }

    @Test
    public void getValueOfCartAfterAddingMultipleItemsToShoppingCart(){

        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Orange).to(5.50);
        catalog.setPriceOf(Pear).to(4.50);
        catalog.setPriceOf(Apple).to(4.00);
        catalog.setPriceOf(Banana).to(6.00);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);

        // WHEN
        ShoppingCartItem shoppingCartItem1 = new ShoppingCartItem(Orange,1.50,catalog.getPriceOf(Orange)*1.50);
        ShoppingCartItem shoppingCartItem2 = new ShoppingCartItem(Pear,2.00,catalog.getPriceOf(Pear)*2.00);
        ShoppingCartItem shoppingCartItem3 = new ShoppingCartItem(Apple,2.50,catalog.getPriceOf(Apple)*2.50);
        ShoppingCartItem shoppingCartItem4 = new ShoppingCartItem(Banana,3.00,catalog.getPriceOf(Banana)*3.00);
        shoppingCart.addItem(shoppingCartItem1);
        shoppingCart.addItem(shoppingCartItem2);
        shoppingCart.addItem(shoppingCartItem3);
        shoppingCart.addItem(shoppingCartItem4);

        // THEN
        assertThat(shoppingCart.totalValueOfCart()).isEqualTo(45.25);
    }

    @Test
    public void addASingleItemOfMoreThanFiveKilosInWeight(){
        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Orange).to(5.50);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);

        // WHEN
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem(Orange,6.00,catalog.getPriceOf(Orange)*6.00);
        shoppingCart.addItem(shoppingCartItem);

        // THEN
        assertThat(shoppingCart.totalValueOfCart()).isEqualTo(29.70);
    }

    @Test
    public void addASingleItemOfMoreThanFiveKilosInWeightToACartWithOtherItems(){
        // GIVEN
        Catalog catalog = new Catalog();
        catalog.setPriceOf(Orange).to(5.50);
        catalog.setPriceOf(Pear).to(4.50);
        catalog.setPriceOf(Apple).to(4.00);
        catalog.setPriceOf(Banana).to(6.00);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);

        // WHEN
        ShoppingCartItem shoppingCartItem1 = new ShoppingCartItem(Orange,1.50,catalog.getPriceOf(Orange)*1.50);
        ShoppingCartItem shoppingCartItem2 = new ShoppingCartItem(Pear,6.00,catalog.getPriceOf(Pear)*6.00);
        ShoppingCartItem shoppingCartItem3 = new ShoppingCartItem(Apple,2.50,catalog.getPriceOf(Apple)*2.50);
        shoppingCart.addItem(shoppingCartItem1);
        shoppingCart.addItem(shoppingCartItem2);
        shoppingCart.addItem(shoppingCartItem3);

        // THEN
        assertThat(shoppingCart.totalValueOfCart()).isEqualTo(42.55);
    }

    @Test(expected = FruitUnavailableException.class)
    public void exceptionThrownWhenFruitUnavailable() {

        /*
        * Assume that a fruit is unavailable when it is not in the catalog.
        * When a fruit has been sold out, the fruit will be removed from the
        * catalog and added when it becomes available.
        */

        // GIVEN
        Catalog catalog = new Catalog();

        // WHEN
        catalog.setPriceOf(Orange).to(5.50);
        catalog.setPriceOf(Pear).to(4.50);
        catalog.setPriceOf(Apple).to(4.00);
        catalog.setPriceOf(Banana).to(6.00);

        // THEN
        assertThat(catalog.getPriceOf(Mulberries)).isEqualTo(6.00);
    }
}
