public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }


    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(isFilled);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //validate the sides
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    //get calculate area of a triangle
    public double area() {
        double sum = (getSide1() + getSide2() + getSide3()) / 2;

        //do the calculation
        double area = Math.sqrt(sum * (sum - getSide1()) * (sum - getSide2()) * (sum - getSide3()));
        return Math.round(area);
    }

    //calculate the perimeter of the triangle
    public double perimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public void printColor() {
        System.out.println("The color of the triangle is: " + getColor());
    }

    public void printIsFilled() {
        System.out.println("Is the triangle filled: " + isFilled());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
