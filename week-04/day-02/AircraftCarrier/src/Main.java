import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Carrier carrierAlly = new Carrier(25, 5000);
        Carrier carrierEnemy = new Carrier(399, 4000);
        F35 f35 = new F35();
        F35 f351 = new F35();
        F35 f352 = new F35();
        F35 f353 = new F35();

        F16 f16 = new F16();
        F16 f161 = new F16();
        F16 f162 = new F16();
        F16 f163 = new F16();

        carrierAlly.add(f16);
        carrierAlly.add(f161);
        carrierAlly.add(f35);
        carrierAlly.add(f351);
        System.out.println(carrierAlly.getStatus());

        carrierAlly.fill();
        System.out.println(carrierAlly.getStatus());
    }
}
