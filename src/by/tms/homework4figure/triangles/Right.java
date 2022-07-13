package by.tms.homework4figure.triangles;

public class Right extends Triangles {

    public Right(String color) {
        super(color);
    }

    public Right(String color, int firstSide, int secondSide, int thirdSide) {
        super(color, firstSide, secondSide, thirdSide);
    }

    @Override
    public double toFindArea() {
        double area = 0.5 * getFirstSide() * getSecondSide();
        return area;
    }

    @Override
    public double toFindDiagonal() {
        double diagonal = Math.sqrt((getFirstSide() * getFirstSide()) + (getSecondSide() * getSecondSide()));
        return diagonal;
    }

}


