package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    String name;
    Pirate captain;
    List<Pirate> crew;

    public Ship(){

    }

    public void fillShip(){
        int numberOfPirates = (int)(Math.random() * 16);

        for (int i = 0; i < numberOfPirates; i++){
            crew.add(i, new Pirate());
        }
        System.out.println(crew.size());
    }
}
