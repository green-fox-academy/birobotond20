package petrolstation;

public class PetrolStationTask {

    public static void main(String[] args) {

        Station petrolStation = new Station();
        Car car = new Car();
        System.out.println(car.gasAmount + " " + car.capacity);
        petrolStation.refill(car);
    }
}
