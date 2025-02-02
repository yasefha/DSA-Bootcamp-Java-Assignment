import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("The smallest num is: " + findMin(num1, num2, num3));
        System.out.println("The largest num is: " + findMax(num1, num2, num3));

    }

    static int findMin(int num1, int num2, int num3) {
        int min = num1;

        if(num2 < min) min = num2;
        if(num3 < min) min = num3;

        return min;
    }

    static int findMax(int num1, int num2, int num3) {
        int max = num1;

        if(num2 > max) max = num2;
        if(num3 > max) max = num3;

        return max;
    }

}