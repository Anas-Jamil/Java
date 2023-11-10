import java.util.Random;

public class tut2_3 {
    public static void main(String [] args) {
        int num1;
        Random generator = new Random();
        System.out.println("Random Numbers: ");
       
        for(int i = 0; i < 7; i++){
            num1 = generator.nextInt(25);
            System.out.println(num1);
        }
    }
}