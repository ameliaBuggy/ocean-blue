package Haters;

public class HateRunner {
    public static void main(String[] args) {
        Hater katie = new Hater("Kehinde", true);

        katie.addReason("He has a dumb grin on his face");
        katie.printReasons();

        WilliamHater katie2 = new WilliamHater(true);

        katie2.heDidIt();
        katie2.printReasons();

    }
} 