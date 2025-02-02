import java.util.Scanner;

public class OddOrEven {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println(num + " is " + isEvenCheck(num));
    }

    static String isEvenCheck(int num) {
        if(num % 2 == 0) return "even number";
        else return "odd number";
    }
}