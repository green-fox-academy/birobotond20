package com.greenfoxacademy.basicwebshop.models;

public class ShopItem implements Comparable{

    private String name;
    private String description;
    private int price;
    private int quantityOfStock;

    public ShopItem(String name, String description, int price, int startQuantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = startQuantityOfStock;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantityOfStock() {
        return this.quantityOfStock;
    }

    @Override
    public int compareTo(Object o) {
        return this.getPrice() - ((ShopItem)o).getPrice();
    }
}
