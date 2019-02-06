package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(){
        this.name = "Twang";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings){
        this();
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void sound() {
        System.out.println("Electric Guitar, a " +
                this.numberOfStrings + "-stringed instrument " +
                "that goes " + this.name);
    }
}
