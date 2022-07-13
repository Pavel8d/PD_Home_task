package by.tms.homework3class;

public class Rectangle {
    private Point point1;
    private Point point2;

    public Rectangle() {
    }

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double areaRectangle() {
        double area = (point1.getX() - point2.getX()) * (point1.getY() - point2.getY());
        return area;
    }

    public double perimeterRectangle() {
        double perimeter = (point1.getX() - point2.getX()) * 2 + (point1.getY() - point2.getY()) * 2;
        return perimeter;
    }
}