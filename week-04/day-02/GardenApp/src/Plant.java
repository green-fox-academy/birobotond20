public class Plant {

    double currentWaterAmount;
    String color;
    double minWaterLevel;

    public Plant(String color) {
        this.color = color;
        this.currentWaterAmount = 0;
        this.minWaterLevel = 2;
    }

    public boolean needsWater(){
        if (this.currentWaterAmount < minWaterLevel){
            return true;
        } else {
            return false;
        }
    }

    public void absorbWater(int inputWaterAmount) {
        this.currentWaterAmount += inputWaterAmount;
    }

    public double getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public void setCurrentWaterAmount(double currentWaterAmount) {
        this.currentWaterAmount = currentWaterAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
