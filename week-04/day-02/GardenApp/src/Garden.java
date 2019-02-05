/**
 * is able to hold unlimited amount of flowers or trees
 * when watering it should only water those what needs water with equally divided amount amongst them
 * eg. watering with 40 and 4 of them need water then each gets watered with 10
 */

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Flower> flowerList;
    private List<Tree> treeList;

    public Garden() {
        this.flowerList = new ArrayList<>();
        this.treeList = new ArrayList<>();
    }

    public void addPlantToGarden(Plant newPlant) {
        if (newPlant instanceof Flower) {
            this.flowerList.add((Flower) newPlant);
        } else if (newPlant instanceof Tree) {
            this.treeList.add((Tree) newPlant);
        }
    }

    public void getFlowersInfo() {
        for (Flower flower : flowerList) {
            if (flower.needsWater()) {
                System.out.println("The " + flower.getColor() + " Flower needs water.");
            } else {
                System.out.println("The " + flower.getColor() + " Flower doesn't need water.");
            }
        }
    }

    public void getTreesInfo() {
        for (Tree tree: treeList) {
            if (tree.needsWater()) {
                System.out.println("The " + tree.getColor() + " Tree needs water.");
            } else {
                System.out.println("The " + tree.getColor() + " Tree doesn't need water.");
            }
        }
    }

    public int thirstyPlants() {
        int numberOfThirstyFlowers = 0;
        int numberOfThirstyTrees = 0;
        for (Flower flower : flowerList) {
            if (flower.needsWater()) {
                numberOfThirstyFlowers++;
            }
        }

        for (Tree tree : treeList){
            if (tree.needsWater()) {
                numberOfThirstyTrees++;
            }
        }

        return numberOfThirstyFlowers + numberOfThirstyTrees;
    }

    public void waterPlants(int inputWater){
        System.out.println("Watering with " + inputWater);
        int amountOfWaterForPerPlant = inputWater / thirstyPlants();

        for (Flower flower : flowerList) {
            if (flower.needsWater()){
                flower.absorbWater(amountOfWaterForPerPlant);
            }
        }

        for (Tree tree : treeList) {
            if (tree.needsWater()){
                tree.absorbWater(amountOfWaterForPerPlant);
            }
        }
    }
}
