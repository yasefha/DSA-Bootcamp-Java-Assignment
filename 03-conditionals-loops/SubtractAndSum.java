public class SubtractAndSum {
    public static void main(String[] args) {
        int n = 234;
        int plus = 0;
        int times = 1;
        int sum = 0;

        while(n != 0) {
            plus = plus + n%10;
            times = times * (n%10);
            n = n/10;
        }

        sum = times - plus;
        System.out.println(sum);
    }
}