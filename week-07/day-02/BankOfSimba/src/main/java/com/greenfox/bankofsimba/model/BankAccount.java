package com.greenfox.bankofsimba.model;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean isKing;
    private boolean isGoodCharacter;

    public BankAccount(String name, int balance, String animalType, boolean initialKingStatus,
                       boolean goodCharacterStatus) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = initialKingStatus;
        this.isGoodCharacter = goodCharacterStatus;
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

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean getKingStatus() {
        return this.isKing;
    }

    public void setKing(boolean king) {
        this.isKing = king;
    }

    public boolean getGoodCharacterStatus() {
        return this.isGoodCharacter;
    }
}
