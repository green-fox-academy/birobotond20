public class IntroduceYourself {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87

        String name = "Bíró Botond";
        byte age = 28;
        double height = 185. / 100;
        System.out.println("Name: " + name +
                "\nAge: " + age +
                "\nHeight: " + height);
        System.out.println("Name: Bíró Botond\nAge: 28\nHeight: 1.85");
    }
}