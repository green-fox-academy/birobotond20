// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        int numberOfGirls, numberOfBoys;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number of girls and boys (respectively) that are coming to the party: ");
        numberOfGirls = scanner.nextInt();
        numberOfBoys = scanner.nextInt();
        int peopleInTotal = numberOfBoys + numberOfGirls;

        if (numberOfGirls > 1){
            if (peopleInTotal >= 20){
                if (numberOfGirls == numberOfBoys) {
                    System.out.println("The party is excellent!");
                } else {
                    System.out.println("Quite cool party!");
                }
            } else {
                System.out.println("Average party...");
            }
        } else {
            System.out.println("Sausage party");
        }
    }
}
