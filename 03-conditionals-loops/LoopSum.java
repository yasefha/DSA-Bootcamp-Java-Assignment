
import java.util.Scanner;

public class LoopSum {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isZero = false;
        int num = 0;

        while(isZero == false) {
            System.out.print("Input number: ");
            int nums = in.nextInt();
            if(nums == 0) {isZero = true;}
            num = num + nums;
        }

        System.out.println(num);
    }
}
