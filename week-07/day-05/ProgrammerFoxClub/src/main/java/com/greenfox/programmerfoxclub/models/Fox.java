package com.greenfox.programmerfoxclub.models;

import java.util.List;

public class Fox {

    String name;
    Gender gender;
    List<String> listOfTricks;
    String favouriteFood;
    String favouriteDrink;

    public Fox(String name){
        this.name = name;
        this.gender = Gender.FEMALE;
        this.listOfTricks = null;
        this.favouriteFood = "chicken";
        this.favouriteDrink = "water";
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<String> getListOfTricks() {
        return this.listOfTricks;
    }

    public int getNumberOfTricks(){
        if (this.listOfTricks == null){
            return 0;
        }
        return this.listOfTricks.size();
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
