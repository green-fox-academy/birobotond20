package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.name = "Duum-duum-duum";
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings) {
        this();
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void sound() {
        System.out.println("Bass Guitar, a " +
                this.numberOfStrings + "-stringed instrument " +
                "that goes " + this.name);
    }
}
