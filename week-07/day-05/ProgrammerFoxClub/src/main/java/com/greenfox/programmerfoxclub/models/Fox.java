package com.greenfox.programmerfoxclub.models;

import java.util.List;

public class Fox {

    String name;
    Gender gender;
    List<String> listOfTricks;
    String favouriteFood;
    String favouriteDrink;

    public Fox(String name, Gender gender, List<String> listOfTricks, String favouriteFood, String favouriteDrink) {
        this.name = name;
        this.gender = gender;
        this.listOfTricks = listOfTricks;
        this.favouriteFood = favouriteFood;
        this.favouriteDrink = favouriteDrink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<String> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteDrink() {
        return favouriteDrink;
    }

    public void setFavouriteDrink(String favouriteDrink) {
        this.favouriteDrink = favouriteDrink;
    }
}
