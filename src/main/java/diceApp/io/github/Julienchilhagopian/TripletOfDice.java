package diceApp.io.github.Julienchilhagopian;

public class TripletOfDice {
    private int nbSides, dice1Value, dice2Value, dice3Value;

    /**
     * Constructor to create a new triplet of dice
     * @param nbSides nb of desired sides for the triplet of dice
     */
    public TripletOfDice(int nbSides) {
            if(nbSides <= 0) {
                throw new IllegalArgumentException("Your dice cant have no sides");
            }
            this.nbSides = nbSides;

    }

    /**
     * This method rolls all the dice once
     */

    public void rollAllDice() {
        this.dice1Value = this.randomNumber(this.nbSides);
        this.dice2Value = this.randomNumber(this.nbSides);
        this.dice3Value = this.randomNumber(this.nbSides);
    }

    /**
     * This method rolls a specific dice whose number is provided as a parameter.
     * @param diceNumber number of the targeted dice to roll.
     * @exception IllegalArgumentException if the argument aint equal to 1, 2 or 3.
     */
    public void rollOneDice(int diceNumber) {
        if(diceNumber < 1 || diceNumber > 3) {
            throw new IllegalArgumentException("index out of available dice");
        }
        switch (diceNumber) {
            case 1:
                this.dice1Value = this.randomNumber(this.nbSides);
                break;
            case 2:
                this.dice2Value = this.randomNumber(this.nbSides);
                break;
            case 3:
                this.dice3Value = this.randomNumber(this.nbSides);
                break;
        }
    }

    private int randomNumber(int nbSides) {
        return (int)(Math.random()*nbSides) + 1;
    }

    /**
     * @exception IndexOutOfBoundsException trigger exception if the dice is never being rolled.
     * @return the first dice value
     */
    public int getDice1() {
        if(this.dice1Value == 0) {
            throw new IndexOutOfBoundsException("roll a dice first");
        }
        return this.dice1Value;
    }

    public int getDice2() {
        return this.dice2Value;
    }

    public int getDice3() {
        return this.dice3Value;
    }

}
