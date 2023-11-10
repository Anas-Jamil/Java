import java.util.Scanner;

class Square {
    private int[][] square;

    public Square(int size) {
        square = new int[size][size];
    }

    public int sumRow(int row) {
        int sum = 0;
        for (int col = 0; col < square.length; col++) {
            sum += square[row][col];
        }
        return sum;
    }

    public int sumCol(int col) {
        int sum = 0;
        for (int row = 0; row < square.length; row++) {
            sum += square[row][col];
        }
        return sum;
    }

    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length - 1 - i];
        }
        return sum;
    }

    public boolean magic() {
        int sum = sumRow(0); // Calculate the sum of the first row
        for (int i = 1; i < square.length; i++) {
            if (sumRow(i) != sum || sumCol(i) != sum) {
                return false;
            }
        }
        return sumMainDiag() == sum && sumOtherDiag() == sum;
    }

    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    public void printSquare() {
        for (int[] row : square) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
