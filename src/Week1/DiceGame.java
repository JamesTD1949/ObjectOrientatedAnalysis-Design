package Week1;

public class DiceGame {
    public static void main(String[] args) {
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        System.out.println(playDiceGame(die1,die2));

    }

    public static String playDiceGame(Dice die1,Dice die2)
    {

        die1.roll();
        die2.roll();

        if(die1.getFaceValue() + die2.getFaceValue() == 7)
        {
            return "You win";
        }
        else
        {
            return "You Lose";
        }
    }
}
