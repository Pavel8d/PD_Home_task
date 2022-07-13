package by.tms.homework3class;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(6, 8);
        Point point2 = new Point(3, 4);
        System.out.println("Диогональ: " + point1.distance(point1, point2));
        Rectangle rectangle1 = new Rectangle(point1, point2);
        rectangle1.areaRectangle();
        rectangle1.perimeterRectangle();
        System.out.println("Площадь: " + rectangle1.areaRectangle());
        System.out.println("Периметр: " + rectangle1.perimeterRectangle());
    }

}
