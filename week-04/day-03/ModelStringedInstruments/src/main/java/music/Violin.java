package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this.name = "Screech";
        this.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        this();
        this.numberOfStrings = 4;
    }

    @Override
    public void sound() {
        System.out.println("Violin, a " +
                this.numberOfStrings + "-stringed instrument " +
                "that goes " + this.name);
    }
}
