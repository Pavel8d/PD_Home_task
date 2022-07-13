package by.tms.homework4figure.quadrangle;


import java.util.Objects;

public class Parallelogram extends Quadrangle implements СalculateArea {

    private int height;

    public Parallelogram(String color) {
        super(color);
    }

    public Parallelogram(String color, int firstSide, int secondSide) {
        super(color, firstSide, secondSide);
    }

    public Parallelogram(String color, int firstSide, int secondSide, int height) {
        super(color, firstSide, secondSide);
        this.height = height;
    }

    @Override
    public int toFindArea() {
        int area = getFirstSide() * this.height;
        return area;
    }

    @Override
    public double toFindDiagonal() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "height=" + height +
                '}';
    }
}





