package by.tms.homework4figure.quadrangle;

public class Rectangle extends Parallelogram {

    public Rectangle(String color, int firstSide, int secondSide, int height) {
        super(color, firstSide, secondSide, height);
    }

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color, firstSide, secondSide);
    }

    @Override
    public int toFindArea() {
        super.toFindArea();
        int area = getFirstSide() * getSecondSide();
        return area;
    }

    @Override
    public double toFindDiagonal() {
        double diagonal = Math.sqrt((getFirstSide() * getFirstSide()) + (getSecondSide() * getSecondSide()));
        return diagonal;
    }

}





