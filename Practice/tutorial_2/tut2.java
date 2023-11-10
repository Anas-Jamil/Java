import java.text.DecimalFormat;
import java.util.Scanner;

public class tut2 {
    public static void main(String [] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner MyInp = new Scanner(System.in);
            System.out.println("Please Enter Radius of Circle: ");
            Double Radius = MyInp.nextDouble();
            Double Volume = (4 * Math.PI * Math.pow(Radius, 3)/3);
            Double SurfaceArea = (4 * Math.PI * Math.pow(Radius, 2));
        MyInp.close();

        System.out.println("Surface Area: " + df.format(SurfaceArea));
        System.out.println("Volume: " + df.format(Volume));

    }
}