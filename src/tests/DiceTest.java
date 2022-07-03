
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.*;
public class DiceTest {

@Test

  public void testConstructorOne () {

    //Given a new die is created
    Dice dice = new Dice(5);
    int expectedNumberOfDice = 5;
    int expectedNumberOfSides = 6;

    //When
    int actualNumberOfDice = dice.getNumberOfDice();
    int actualNumberOfSides = dice.getNumberOfSides();

    //Then
    Assertions.assertEquals(expectedNumberOfDice, actualNumberOfDice);
    Assertions.assertEquals(expectedNumberOfSides, actualNumberOfSides);


    }

  @Test

  public void testConstructorTwo () {

    //Given a new die is created
    int expectedNumberOfDice = 7;
    int expectedNumberOfSides = 6;
    Dice dice = new Dice(expectedNumberOfDice, expectedNumberOfSides);

    //When
    int actualNumberOfDice = dice.getNumberOfDice();
    int actualNumberOfSides = dice.getNumberOfSides();

    //Then
    Assertions.assertEquals(expectedNumberOfDice, actualNumberOfDice);
    Assertions.assertEquals(expectedNumberOfSides, actualNumberOfSides);

  }

  @Test

  public void testTossAndSum () {
  //Given
  int expectedNumberOfDice = 5;
  Dice dice = new Dice(expectedNumberOfDice);

  //When
    int tossedDice = dice.tossAndSum();
    boolean expectedResult = tossedDice >= 2 && tossedDice <= 20;

    //Then
    Assertions.assertTrue(expectedResult);



  }




}
