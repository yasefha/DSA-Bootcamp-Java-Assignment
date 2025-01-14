import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double phi = 3.14;
        double radius;
        double area;

        System.out.print("Input raidus: ");
        radius = in.nextDouble();

        area = phi*radius*radius;

        System.out.println("The area of circle: " + area);

    }
}