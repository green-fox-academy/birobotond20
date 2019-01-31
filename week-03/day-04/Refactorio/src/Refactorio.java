// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class Refactorio {

    public static void main(String[] args) {

        System.out.println(refactorio(10));
    }

    private static int refactorio(int n){

        if (n <= 0){
            return 1;
        } else {
            return refactorio(n - 1) * n;
        }
    }
}
