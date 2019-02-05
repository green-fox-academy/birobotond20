package pirates;

public class PiratesTaskSandBox {

    public static void main(String[] args) {

        Pirate pirateJoe = new Pirate("Joe");
        Pirate pirateSteve = new Pirate("Steve");

        pirateJoe.drinkSomeRum();

        pirateJoe.brawl(pirateSteve);
    }
}
