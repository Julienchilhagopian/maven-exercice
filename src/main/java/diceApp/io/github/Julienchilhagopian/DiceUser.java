package diceApp.io.github.Julienchilhagopian;

public class DiceUser {

    public static void main(String[] args) throws Exception {
        TripletOfDice triplet = rollOnce();
        System.out.println("The dice number 1 is a " + triplet.getDice1());
        System.out.println("The dice number 2 is a " + triplet.getDice2());
        System.out.println("The dice number 3 is a " + triplet.getDice3());

    }

    public static TripletOfDice rollOnce() {
        TripletOfDice tripletOfSixFacedDice = new TripletOfDice(6);
        tripletOfSixFacedDice.rollAllDice();
        tripletOfSixFacedDice.rollOneDice(4);
        return tripletOfSixFacedDice;
    }
}
