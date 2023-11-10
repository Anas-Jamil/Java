import java.util.Random;
public class q3 {

    public static void main (String [] args) {

        // create random generator called roll
        Random roll = new Random();

        // simulate die rolls, die 1, die 2
        int die1 = roll.nextInt(6) + 1;
        int die2 = roll.nextInt(6) + 1;
        
        // summation of die rolls
        int totalroll = (die1 + die2);
        
        // print statments
        System.out.println("Die 1 Rolled: " + die1 + "\nDie 2 Rolled: " + die2);
        System.out.println("The total of the die roll is: " + totalroll);

    }

}