package dominoes;

public class Domino implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino other) {
        // Change only happens, when we return -1;
        // 0 and 1 only matters from a logical point of view: if we would compare two 'e' chars,
        // it would be strange if we would return 1, instead of 0.
        // In this example, this.getLeftSide is the second element in the array. This is why we
        // formulate the statement based on the second elements(i+1) in relation to the first
        // element(i).
        // https://medium.com/omarelgabrys-blog/comparing-objects-307400115f88
        if (this.getLeftSide() < other.getLeftSide()){
            return -1;
        }
        return 1;
    }
}