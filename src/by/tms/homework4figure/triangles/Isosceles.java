package by.tms.homework4figure.triangles;

import java.util.Objects;

public class Isosceles extends Triangles {

    private int height;

    public Isosceles(String color) {
        super(color);
    }

    public Isosceles(String color, int firstSide, int secondSide, int thirdSide, int height) {
        super(color, firstSide, secondSide, thirdSide);
        this.height = height;
    }

    @Override
    public double toFindArea() {
        double area = 0.5 * height * getThirdSide();
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
        Isosceles isosceles = (Isosceles) o;
        return height == isosceles.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

    @Override
    public String toString() {
        return "Isosceles{" +
                "height=" + height +
                '}';
    }
}
