package com.greenfox.bankofsimba.model;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean king;
    private boolean goodCharacter;

    public BankAccount(){
        this.king = false;
        this.goodCharacter = true;
    }

    public BankAccount(String name, int balance, String animalType, boolean initialKingStatus,
                       boolean goodCharacterStatus) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = initialKingStatus;
        this.goodCharacter = goodCharacterStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void raiseBalance() {
        if (this.isKing()){
            this.balance += 100;
        } else {
            this.balance += 10;
        }
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return this.king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public boolean isGoodCharacter() {
        return this.goodCharacter;
    }

    public void setGoodCharacter(boolean goodCharacter) {
        this.goodCharacter = goodCharacter;
    }
}
