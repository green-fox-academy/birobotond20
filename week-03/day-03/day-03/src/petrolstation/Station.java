package petrolstation;

public class Station {

    int gasAmount;

    public Station(){
        this.gasAmount = 1000;
    }

    public void refill(Car car){
        this.gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
        System.out.println("Car refilled:" +
                "\nthe cars gas amount is " + car.gasAmount +
                "\nremaining gas in the petrol station: " + this.gasAmount);
    }
}
