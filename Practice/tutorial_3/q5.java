import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class q5{ 
// main reads in the price per pound of a deli item
// and number of ounces of a deli item then computes
// the total price and prints a "label" for the item
    public static void main (String[] args){
        
        NumberFormat cur = NumberFormat.getCurrencyInstance();
        DecimalFormat dec = new DecimalFormat(".00");
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound; // price per pound
        double weightOunces; // weight in ounces
        double weight; // weight in pounds
        double totalPrice; // total price for the item
        Scanner scan = new Scanner(System.in);
        System.out.println ("Welcome to the CS Deli! ! \n ");
        System.out.println("Enter the price per pound of your item:"); 
        pricePerPound = scan.nextDouble();
        System.out.println("Enter the weight (ounces):"); 
        weightOunces = scan.nextDouble();
        // Convert ounces to pounds and compute the total price 
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        System.out.println("***** CSDeli ***** \nUnit Price: " + cur.format(pricePerPound) + "\n" + "Weight: " + dec.format(weight) + " Pounds" + "\n\n" + "TOTAL: " + cur.format(totalPrice) );

    }
}
