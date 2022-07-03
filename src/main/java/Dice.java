
import java.util.Random;
public class Dice {

    public int numberOfSides;
    public int numberOfDice;

    public Dice(int numberOfDice){ //my first constructor

        this.numberOfDice = numberOfDice;
        this.numberOfSides = 6;

    }

    public Dice (int numberOfDice, int numberOfSides){ //my second constructor
        this.numberOfDice = numberOfDice;
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getNumberOfDice(){
        return numberOfDice;
    }

    public Integer tossAndSum () {
        Random randomNumber = new Random();

        int sumOfDice = 0;

        for(int i=0; i <= numberOfDice; i++){
            sumOfDice += randomNumber.nextInt(7) ; //nextint finds a random number from 0 (inclusive) to number passed N (exclusive) so bound = 6.

        }

        return sumOfDice;

    }



}
