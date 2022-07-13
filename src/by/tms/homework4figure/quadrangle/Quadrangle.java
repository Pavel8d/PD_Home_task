package by.tms.homework4figure.quadrangle;

import by.tms.homework4figure.CalculateDiagonal;
import by.tms.homework4figure.Shape;

public abstract class Quadrangle extends Shape implements CalculateDiagonal {
    private int firstSide;
    private int secondSide;

    public Quadrangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Quadrangle(String color) {
        super(color);
    }


    public int perimeterQuadrangle() {
        int perimeter = firstSide * 2 + secondSide * 2;
        return perimeter;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }
}
