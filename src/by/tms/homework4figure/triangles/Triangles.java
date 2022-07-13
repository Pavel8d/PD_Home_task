package by.tms.homework4figure.triangles;

import by.tms.homework4figure.CalculateDiagonal;
import by.tms.homework4figure.Shape;

public abstract class Triangles extends Shape implements CalculateAreaTriangles, CalculateDiagonal {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangles(String color) {
        super(color);
    }

    public Triangles(String color, int firstSide, int secondSide, int thirdSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public int perimeterTriangles() {
        int perimeter = firstSide + secondSide + thirdSide;
        return perimeter;
    }


    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }
}

