/**
 * is able to hold unlimited amount of flowers or trees
 * when watering it should only water those what needs water with equally divided amount amongst them
 * eg. watering with 40 and 4 of them need water then each gets watered with 10
 */

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plantList;

    public Garden() {
        this.plantList = new ArrayList<>();
    }

    public void addPlantToGarden(Plant newPlant) {
        if (newPlant instanceof Flower) {
            this.plantList.add(0, newPlant);
        } else if (newPlant instanceof Tree) {
            this.plantList.add(newPlant);
        }
    }

    public void getPlantInfo() {
        for (Plant plant : plantList) {
            if (plant.needsWater()) {
                System.out.println("The " + plant.getColor() + " " +
                        plant.getClass().getSimpleName() +" needs water.");
            } else {
                System.out.println("The " + plant.getColor() + " " +
                        plant.getClass().getSimpleName() +" doesn't need water.");
            }
        }
    }

    public int thirstyPlants() {
        int numberOfThirstyPlants = 0;
        for (Plant plant : plantList) {
            if (plant.needsWater()) {
                numberOfThirstyPlants++;
            }
        }
        return numberOfThirstyPlants;
    }

    public void waterPlants(int inputWater){
        System.out.println("Watering with " + inputWater);
        int amountOfWaterPerPlant = inputWater / thirstyPlants();

        for (Plant plant : plantList) {
            if (plant.needsWater()){
                plant.absorbWater(amountOfWaterPerPlant);
            }
        }
    }
}
