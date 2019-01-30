package sharpie;

public class SharpieTask {
    public static void main(String[] args) {

        Sharpie sharpie = new Sharpie("green", 1.2);
        System.out.println("Color: " + sharpie.color +
                "\nwidth: " + sharpie.width +
                "\namount of ink: " + sharpie.inkAmount);

        sharpie.use();
        System.out.println("Color: " + sharpie.color +
                "\nwidth: " + sharpie.width +
                "\namount of ink: " + sharpie.inkAmount);
    }
}
