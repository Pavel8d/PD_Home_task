package by.tms.homework4figure;

public abstract class Shape {
    private int firstSide;
    private int height;
    private String color;

    public Shape(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

