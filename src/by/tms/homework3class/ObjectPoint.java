package by.tms.homework3class;

public class ObjectPoint {

    public static void main(String[] args) {

        Point point1 = new Point(4, 10);
        Point point2 = new Point(2, 5);
        System.out.println(point1.distance(point1, point2));
        System.out.println(point2.distance(point1, point2));
    }
}
