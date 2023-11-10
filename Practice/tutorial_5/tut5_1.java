import java.util.Scanner;
public class tut5_1{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        float average1 = average(n1, n2);
        System.out.println(average1);

        int n3 = scan.nextInt();

        float average2 = average(n1,n2,n3);
        System.out.println(average2);

    }
    public static float average(int n1, int n2) {

        return (float) (n1+n2)/2;
    }
    public static float average(int n1,int n2,int n3){

        return (float) (n1+n2+n3)/2;

    }

    
}