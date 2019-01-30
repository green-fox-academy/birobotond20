package counter;

public class Counter {

    int counter;

    public Counter() {
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public void add(int number) {
        this.counter += number;
    }

    public void add(){
        this.counter++;
    }

    public int get(){
        return this.counter;
    }

    public void reset(){
        this.counter = 0;
    }
}
