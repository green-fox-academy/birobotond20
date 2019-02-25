public class Aircraft implements Comparable<Aircraft>{

    int maxAmmo;
    int currentAmmo;
    int baseDamage;

    public Aircraft() {
        this.currentAmmo = 0;
    }

    public int fight(){
        return this.baseDamage * this.currentAmmo;
    }

    public int refill(int ammoReceived){

        int ammoNeeded = this.maxAmmo - this.currentAmmo;

        if (ammoReceived > ammoNeeded) {
            this.currentAmmo += ammoNeeded;
            return ammoReceived - ammoNeeded;
        } else {
            this.currentAmmo += ammoReceived;
            return 0;
        }
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }

    public String getStatus(){
        return "Type " + this.getClass().getSimpleName() +
                ", Ammo: " + this.currentAmmo +
                ", Base Damage: " + this.baseDamage +
                ", All damage: " + this.fight();
    }

    public boolean isPriority(){
        return this.getClass().getSimpleName().equals("F35");
    }

    @Override
    public int compareTo(Aircraft o) {
        if (o.isPriority()) {
            return -1;
        }
        return 1;
    }
}
