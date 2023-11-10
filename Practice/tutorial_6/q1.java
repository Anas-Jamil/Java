import java.util.Scanner;

public class q1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("How many questions are on the quiz? ");
        int n_of_question = scan.nextInt();
        int i;
        int[] key = new int[n_of_question];
        for (i=0; i < n_of_question; i++){
            
            System.out.println("Please enter the solution of question " + (i+1) + ": ");
            key[i] = scan.nextInt();
        }
        int[] answers = new int[n_of_question];
        for (int j = 0; j < n_of_question; j++) {

            System.out.println("Enter answer " + (j+1) + ": ");
            answers[j] = scan.nextInt();
        }
        int correct = 0;
        for (int k = 0; k < n_of_question; k++) {
            if (k < key.length && k < answers.length && key[k] == answers[k]) {
                correct++;
            }
        }
            
        double correctp = (double) correct / n_of_question * 100;
        System.out.println("Questions answered correctly: " + correct);
        System.out.println("Percentage Grade: " + correctp + "%");
            
        while (true) {
        System.out.print("Grade another quiz? (y/n): ");
        String choice = scan.next();
        if (!choice.equalsIgnoreCase("y")) {
            break;
        }

        }

    }

}