package by.tms.homework4figure.triangles;

public class Equilateral extends Triangles {

    public Equilateral(String color) {
        super(color);
    }

    public Equilateral(String color, int firstSide, int secondSide, int thirdSide) {
        super(color, firstSide, secondSide, thirdSide);
    }

    @Override
    public double toFindArea() {
        double area = ((Math.pow(getFirstSide(), 2)) * (Math.sqrt(3))) / 4;
        return area;
    }

    @Override
    public double toFindDiagonal() {
        return 0;
    }

}
