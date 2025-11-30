import src.Rectangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

    }
}