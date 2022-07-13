package by.tms.homework4figure;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(int firstDiagоnal, int secondDiagonal) {
        if (firstDiagоnal > 0 && secondDiagonal > 0 && firstDiagоnal == secondDiagonal) {
            return true;
        }
        return false;
    }

    public static boolean isTriangles(int firstSide, int secondSide, int thirdSide) {
        if (firstSide != 0 && secondSide != 0 && thirdSide != 0 && firstSide + secondSide > thirdSide
                && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            return true;
        }
        return false;
    }

}
