import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        double distanceInKm, distanceInMile;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the distance in km: ");
        distanceInKm = scanner.nextDouble();
        distanceInMile = distanceInKm / 1.609;

        System.out.println(distanceInKm + "km is " + distanceInMile + " miles");
    }
}