import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        //System.out.println("Hello World");
        // #1. Calculate Compound Interest
        CompoundInterest ci = new CompoundInterest();
        ci.Interest();

        // #2. Enum Basic Demo
        EnumDemo ed = new EnumDemo();
        ed.EnumDemoBasic();

        // #3. Area
        // 3.1 Square
        double length;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter length of the Square:");
        length = stdin.nextDouble();
        System.out.println();
        Area square = new Area();
        System.out.println("Area of square is:"+ square.Square(length) + " unit-square");

        // 3.2 Circle
        System.out.println("Enter radius of the Circle:");
        double radius = stdin.nextDouble();
        Area circle = new Area();
        System.out.println("Area of circle is: "+circle.Circle(radius) + " unit-square");

        // 3.3 Rectangle
        System.out.println("Enter length of the Rectangle:");
        length= stdin.nextDouble();
        System.out.println("Enter breadth of the Rectangle:");
        double breadth = stdin.nextDouble();
        Area rect = new Area();
        System.out.println("Area of the Rectangle is: "+ rect.Rectangle(length,breadth)+" unit-square");

    }
}
