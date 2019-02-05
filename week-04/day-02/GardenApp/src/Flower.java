/**
 * needs water if its current water amount is less then 5
 * when watering it the flower can only absorb the 75% of the water
 * eg. watering with 10 the flower's amount of water should only increase with 7.5
 */

public class Flower extends Plant {

    private static final double WATER_ABSORPTION = 0.75;

    public Flower(String color) {
        super(color);
        this.minWaterLevel = 5;
    }

    @Override
    public void absorbWater(int inputWaterAmount){
        setCurrentWaterAmount(getCurrentWaterAmount() + inputWaterAmount * WATER_ABSORPTION);
    }
}
