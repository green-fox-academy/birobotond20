// Create a program that prints all the even numbers between 0 and 500

public class PrintEven {

    public static void main(String[] args) {

        // Method 1
        for (int i = 0; i <= 500; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //Method 2
        for (int i = 0; i <= 500; i+=2){
            System.out.println(i);
        }
    }
}
