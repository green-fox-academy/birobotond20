import java.util.stream.IntStream;

public class Shifter implements CharSequence{

    String string;
    int shiftBy;

    public Shifter(String string, int shiftBy){
        this.string = string;
        this.shiftBy = shiftBy;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(index + this.shiftBy);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
