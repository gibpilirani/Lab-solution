import java.util.Scanner;
public class Main {
    public static  void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        do {
            System.out.print("Enter first side of the triangle: ");
            side1 = Double.parseDouble(input.next());
            System.out.println();
            System.out.print("Enter second side of the triangle: ");
            side2 = Double.parseDouble(input.next());
            System.out.println();
            System.out.print("Enter third side of the triangle: ");
            side3 = Double.parseDouble(input.next());


            if (!Triangle.isValidTriangle(side1, side2, side3)) {
                System.out.println("Sum of two sides cannot be less than one side. Please enter valid values.");
            }
        } while (!Triangle.isValidTriangle(side1, side2, side3));

        System.out.println();
        System.out.print("Enter color of a triangle: ");
        String color = input.next();
        System.out.println();
        System.out.print("Is the triangle filled (ture/false): ");
        boolean isFilled = input.nextBoolean();
        System.out.println();

        Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);

        triangle.setSide1(side1);
        triangle.setSide2(side2);
        triangle.setSide3(side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        triangle.printColor();
        triangle.printIsFilled();
        double calculatedArea = triangle.area();
        double calculatedPerimeter = triangle.perimeter();

        System.out.println("Calculated Area: %. 2f" + calculatedArea);
        System.out.println("Calculated Perimeter: " + calculatedPerimeter);

    }


}
