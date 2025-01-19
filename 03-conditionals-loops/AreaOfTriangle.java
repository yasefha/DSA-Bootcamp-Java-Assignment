import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Area of Triangle Program");

        System.out.print("Input base of triangle: ");
        int base = in.nextInt();

        System.out.print("Input height of triangle: ");
        int height = in.nextInt();

        double area = base * height / 2;

        System.out.println("The area of triangle is: " + area);
    }
}