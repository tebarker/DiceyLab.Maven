
import java.util.Random;
public class Dice {

    public int numberOfSides;
    public int numberOfDice;

    public Dice(int numberOfDice){

        this.numberOfDice = numberOfDice;
        this.numberOfSides = 6;

    }

    public Dice (int numberOfDice, int numberOfSides){
        this.numberOfDice = numberOfDice;
        this.numberOfSides = numberOfSides;
    }

    public Integer tossAndSum () {
        Random randomNumber = new Random();

        int sumOfDice = 0;

        for(int i=0; i <= numberOfDice; i++){
            sumOfDice += (randomNumber.nextInt(6) +1);
        }

        return sumOfDice;

    }



}
