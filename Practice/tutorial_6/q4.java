import java.util.ArrayList;
import java.util.Scanner;

class Parameters{
    public static void main(String[] args) {
        int[] val = {42, 69, 37};
        int[] val2 = {35, 43, 93, 23, 40, 21, 75};
        double mean1 = average(val);
        double mean2 = average(val2);
        System.out.println("mean1 = " + mean1);
        System.out.println("mean2 = " + mean2);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerList = new ArrayList<>();

        System.out.println("Enter a sequence of non-negative integers: ");

        int input;
        int count = 0;

        while (count < 20) { 
            input = scanner.nextInt();
            if (input <= 0) {
                break; 
            }
            integerList.add(input);
            count++;
        }

        int[] userInputs = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            userInputs[i] = integerList.get(i);
        }

        double userMean = average(userInputs);
        System.out.println("The average of the list is: " + userMean);

        int minValue = minimum(userInputs);
        System.out.println("The minimum value in the entire list is: " + minValue);
        System.out.println("The minimum value in mean1: " + minimum(val));
        System.out.println("The minimum value in mean2: " + minimum(val2));
        scanner.close();
    }

    public static double average(int[] list) {
        double result = 0.0;
        if (list.length != 0) {
            int sum = 0;
            for (int num : list)
                sum += num;
            result = (double) sum / list.length;
            System.out.println(sum);
            System.out.println(list.length);
        }
        return result;
    }

    public static int minimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No values provided");
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}

