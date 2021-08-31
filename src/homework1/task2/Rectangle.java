package homework1.task2;

public class Rectangle {
    private double side1;
    private double side2;
    private double area;
    private double perimeter;

    public Rectangle() {
    }

    public double areaCalculator(double side1, double side2) {
        area = side1 * side2;
        return area;
    }

    public double perimeterCalculator(double side1, double side2) {
        perimeter = (side1 + side2) * 2;
        return perimeter;
    }

    public void result() {
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }

}
