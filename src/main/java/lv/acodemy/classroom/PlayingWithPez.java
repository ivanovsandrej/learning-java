package lv.acodemy.classroom;

public class PlayingWithPez {
    public static void main(String[] args) {
        PezDispenser emperor = new PezDispenser("Emperor of makind", "gold", "Warhammer40k", 12, 0, 5);
        emperor.giveFewCandy(1);
        emperor.giveFewCandy(2);
        emperor.giveOneCandy();
        emperor.giveFewCandy(2);


    }
}
