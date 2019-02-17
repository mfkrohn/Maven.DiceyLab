import java.util.ArrayList;
import java.util.Random;
public class Dice {


    public  int diceThrow(int numberOfDice) {
        Random rollDice = new Random();
        int sum = 0;
        //ArrayList<Integer> diceResults = new ArrayList<Integer>();
        for(int i = 0; i < numberOfDice; i++){
            int roll = rollDice.nextInt(6) + 1;
            //diceResults.add(roll);
            sum += roll;
        }
        return sum;
        }




    }



