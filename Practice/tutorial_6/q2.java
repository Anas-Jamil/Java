
import java.util.Scanner;

public class q2{

    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    int numElements;

    System.out.print ("Enter the number of elements in the array: ");
    numElements = scan.nextInt();

    int[] a = new int[numElements];

    System.out.println ("Enter the array elements (integers)...");
    for (int i = 0; i < numElements; i++)
    {
        System.out.print ("Enter element " + (i+1) + ": ");
        a[i] = scan.nextInt();
    }

    System.out.println ();
    System.out.println ("The array elements before reversing:");
    for (int i = 0; i < numElements; i++)
        System.out.print (a[i] + "  ");
    System.out.println();


    for (int i = 0; i < numElements/2; i++)
        {
        int temp = a[i];
        a[i] = a[numElements-1-i];
        a[numElements-1-i] = temp;
        }

    System.out.println ("\nThe array after reversing: ");
    for (int i = 0; i < numElements; i++)
        System.out.print (a[i] + "  ");
    System.out.println();

            
    scan.close();

        }

    }

