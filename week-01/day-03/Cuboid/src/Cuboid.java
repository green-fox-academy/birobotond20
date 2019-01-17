// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

import java.util.Scanner;

public class Cuboid {

    public static void main(String[] args){

        double length;
        double height;
        double depth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the length, height and depth of the cuboid separated with spaces: ");
        length = scanner.nextDouble();
        height = scanner.nextDouble();
        depth = scanner.nextDouble();

        int surfaceArea, volume;

        surfaceArea = (int)(2 * (length * height + height * depth + depth * length));
        volume = (int)(length * height * depth);

        System.out.println("Surface Area: " + surfaceArea +
                "\nVolume: " + volume);
    }
}
