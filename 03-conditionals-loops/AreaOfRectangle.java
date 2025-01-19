import java.util.Scanner;

public class AreaOfRectangle {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Area of rectangle");
    
    System.out.print("Input length: ");
    double length = in.nextInt();

    System.out.print("Input width: ");
    double width = in.nextInt();

    double area = length * width;
    System.out.println("The area of rectangle: " + area);
  }
}