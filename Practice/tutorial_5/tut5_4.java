
import java.util.Scanner;
public class tut5_4
{

    public static void askQuestions(Question a)
    {

        System.out.print(a.getQuestion());
        System.out.println(" (Level: " + a.getComplexity() + ")");


        Scanner scan = new Scanner(System.in);
        String possible = scan.nextLine();


        if (a.answerCorrect(possible))
            System.out.println("Answer is correct!");
        else
            System.out.println("The answer is incorrect! The correct answer is: " + a.getAnswer());
    }
    public static void main(String[] args)
    {
        Question q1, q2;

        q1 = new Question("What is the capital of Jamaica?",
                "Kingston");
        q1.setComplexity(4);

        q2 = new Question("Which is worse, ignorance or apathy?",
                "I don't know and I don't care");

        q2.setComplexity(10);

        askQuestions(q1);
        askQuestions(q2);
    }
}