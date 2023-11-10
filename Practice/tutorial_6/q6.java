
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class SquareTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("C:\\Users\\anasj\\OneDrive\\Desktop\\js\\tutorial6\\magicData.txt"));
        int count = 1; // Count which square we're on
        int size = scan.nextInt(); // Size of the next square

        // Expecting -1 at the bottom of the input file
        while (size != -1) {
            // Create a new Square of the given size
            Square square = new Square(size);
            square.readSquare(scan);

            System.out.println("\n******** Square " + count + " ********");
            square.printSquare();

//print the sums of its rows
            System.out.println("Row Sums:");
            for (int i = 0; i < size; i++) {
                System.out.print(square.sumRow(i) + " ");
            }

//print the sums of its columns
            System.out.println("\nColumn Sums:");
            for (int i = 0; i < size; i++) {
                System.out.print(square.sumCol(i) + " ");
            }
//print the sum of the diagonals
            System.out.println("\nMain Diagonal Sum: " + square.sumMainDiag());
            System.out.println("Other Diagonal Sum: " + square.sumOtherDiag());

//determine and print whether it is a magic square
            if (square.magic()) {
                System.out.println("Magic square!");
            } else {
                System.out.println("Not a magic square.");
            }

            // Get the size of the next square
            size = scan.nextInt();
            count++;
        }
    }
}
