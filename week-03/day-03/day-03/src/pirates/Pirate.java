package pirates;

public class Pirate {

    String name;
    public int drunkMeter;
    public boolean isAlive;

    public Pirate(){
        this.drunkMeter = 0;
        this.isAlive = true;
    }

    public Pirate(String name){
        this.name = name;
        this.drunkMeter = 0;
        this.isAlive = true;
    }

    public void drinkSomeRum(){
        if (isAlive) {
            drunkMeter++;
        } else {
            System.out.println("He's dead.");
        }
    }

    public void howsItGoingMate(){
        if (drunkMeter >= 0 && drunkMeter <= 4){
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passOut();
        }
    }

    private void passOut(){
        System.out.println("This pirate has passed out. Now he needs some sleep.");
        sleep();
    }

    private void sleep(){
        System.out.println("Pirate is sleeping.");
        this.drunkMeter = 0;
    }

    public void die(){
        isAlive = false;
    }

    public void brawl(Pirate pirateToFight){
        if (pirateToFight.isAlive){
            /*
            * 0 = they both pass out
            * 1 = the challenger pirate wins (the one who's brawl method was called), the other dies
            * 2 = the other pirate wins, the challenger dies
            */
            int outcome = (int) (Math.random() * 3);

            switch (outcome){
                case 0:
                    System.out.println("The fight ended in a tie. Both pirates passed out.");
                    pirateToFight.passOut();
                    passOut();
                    break;
                case 1:
                    System.out.println("The challenger pirate won the fight. The other has died.");
                    pirateToFight.die();
                    break;
                case 2:
                    System.out.println("The challenger pirate has lost the fight and died." +
                            "\nThe other walks away proudly.");
                    die();
                    break;
            }
        } else {
            System.out.println("The other pirate is dead, he's not able to fight.\n" +
                    "Choose another pirate if you want to fight.");
        }
    }
}
