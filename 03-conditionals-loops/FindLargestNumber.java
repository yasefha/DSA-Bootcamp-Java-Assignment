import java.util.Scanner;

public class FindLargestNumber {
        public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isZero = false;
        int max = 0;

        while(isZero == false) {
            System.out.print("Input number: ");
            int nums = in.nextInt();
            if(nums == 0) {isZero = true;}
            if(nums > max) {max = nums;}
        }

        System.out.println(max);
    }

}
