import java.util.ArrayList;
import java.util.List;

public class Carrier implements Comparable<Aircraft>{

    List<Aircraft> aircrafts = new ArrayList<>();
    int numberOfAmmoInStore;
    int healthPoint;

    public Carrier(int startingAmmo, int startingHp) {
        this.numberOfAmmoInStore = startingAmmo;
        this.healthPoint = startingHp;
    }

    public void add(Aircraft newAircraft) {
        this.aircrafts.add(newAircraft);

    }

    private int getFleetAmmoNeed(){
        int totalAmmoNeeded = 0;
        for (Aircraft aircraft : this.aircrafts) {
            totalAmmoNeeded += (aircraft.maxAmmo - aircraft.currentAmmo);
        }
        return totalAmmoNeeded;
    }

    public void fill() {

        if (this.numberOfAmmoInStore == 0){
            throw new NullPointerException("No ammo in carrier store.");
        } else if (this.numberOfAmmoInStore < getFleetAmmoNeed()){
            for (Aircraft aircraft : aircrafts) {
                if (numberOfAmmoInStore > 0 && aircraft.isPriority()){
                    numberOfAmmoInStore = aircraft.refill(numberOfAmmoInStore);
                }
            }
            if (numberOfAmmoInStore > 0) {
                for (Aircraft aircraft : aircrafts) {
                    if (numberOfAmmoInStore > 0 && !aircraft.isPriority()){
                        numberOfAmmoInStore = aircraft.refill(numberOfAmmoInStore);
                    }
                }
            }
        } else {
            for (Aircraft aircraft : aircrafts) {
                numberOfAmmoInStore = aircraft.refill(numberOfAmmoInStore);
            }
        }
    }

    public int getFleetDamage(){
        int totalFleetDamage = 0;

        for (Aircraft aircraft : aircrafts) {
            totalFleetDamage += aircraft.fight();
        }
        return totalFleetDamage;
    }

    public void fight(Carrier carrier){
        carrier.healthPoint -= getFleetDamage();
        for (Aircraft aircraft : aircrafts) {
            aircraft.currentAmmo = 0;
        }
    }

    public String getStatus(){

        if (this.healthPoint == 0){
            return "It's dead Jim :(";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (Aircraft aircraft : aircrafts) {
                stringBuilder.append(aircraft.getStatus());
                stringBuilder.append("\n");
            }
            return "HP: " + this.healthPoint +
                    ", Aircraft count: " + aircrafts.size() +
                    ", Ammo Storage: " + this.numberOfAmmoInStore +
                    ", Total damage: " + getFleetDamage() +
                    "\nAircrafts: \n" + stringBuilder.toString();
        }
    }

    @Override
    public int compareTo(Aircraft o) {
        if (o.isPriority()) {
            return -1;
        }
        return 1;
    }
}
