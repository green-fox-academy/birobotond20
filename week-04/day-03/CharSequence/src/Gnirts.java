import java.awt.*;
import java.util.stream.IntStream;

public class Gnirts implements CharSequence{


    String string;

    public Gnirts(String string){
        this.string = string;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(this.string.length() - (index + 1));
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
