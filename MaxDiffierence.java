

// Anas Jamil - 100864684
// Assignment 1
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Assignment1 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in); // Creates a scanner with the id of 'in', allows you to take user input
    int n = in.nextInt(); // Defines 'n' as a integer, and then sets n value to whatever they user enters
    ArrayList<Integer> inputs = new ArrayList<Integer>(n); // Creates a Integer ArrayList with the id of 'inputs', allows to store values dynamically


    for (int i = 0; i < n; i++) { // Creates for loop, will loop over 'n' amount of times
        int input = in.nextInt(); // Takes user input, saves it into 'input', 'n' amount of times
        inputs.add(input); // Adds values stored in 'inputs', to ArrayList 'inputs'
    } // O(n)


    int maxDif = MaxDif(inputs); // Call 'MaxDif' method, while passing inputs ArrayList as an argument, store returned value into 'maxDif'
    System.out.println("Maximum difference: " + maxDif); // Print statement to print the maximum difference
    in.close(); // Closes the scanner
    }
    public static int MaxDif(List<Integer> inputs){ // Creates method 'MaxDif' passing List of integers as input and returns an integer from the ArrayList 'inputs'
        int maxDif = Integer.MIN_VALUE; // Defines 'maxDif' as an Integer and assigned it to smallest possible integer values, used as a starting point to find maximum difference between elements
        int MinDif = Integer.MAX_VALUE; // Defines 'MinDif' as an integer and assigned it to largest possible integer values, used as a starting point to find minimum value in an array or list


        for (int i = 0; i < inputs.size(); i++){ // Creates for loop, will loop over 'size of arraylist' times
            MinDif = Math.min(MinDif, inputs.get(i)); // Uses 'Math.min' method to find minimum value between its current value 'MinDif' and the value at index 'i' in the ArrayList, assigns that to MinDif
            int difference = inputs.get(i) - MinDif; // Defines 'difference' as an integer and assigns the the value of index 'i' subtracted by the value of 'MinDif'
            maxDif = Math.max(maxDif, difference ); // Updates maxDif using Math.max method, updates with the maximum value between current value and the 'difference'
        }
        return maxDif; // returns the value of maxDif


    }
}
