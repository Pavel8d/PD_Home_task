package by.tms.homework4figure;

import by.tms.homework4figure.quadrangle.Parallelogram;
import by.tms.homework4figure.quadrangle.Rectangle;
import by.tms.homework4figure.quadrangle.Rhomb;
import by.tms.homework4figure.quadrangle.Square;
import by.tms.homework4figure.triangles.Equilateral;
import by.tms.homework4figure.triangles.Isosceles;
import by.tms.homework4figure.triangles.Right;

public class Test {
    public static void main(String[] args) {

        Parallelogram parallelogram = new Parallelogram("green", 10, 5, 4);
        System.out.println("Площадь параллелограмма = " + parallelogram.toFindArea());
        System.out.println("Периметр параллелограмма = " + parallelogram.perimeterQuadrangle());

        Rhomb rhomb = new Rhomb("brown", 7, 7, 8);
        System.out.println("    Периметр ромба = " + rhomb.perimeterQuadrangle());
        System.out.println("    Площадь ромба = " + rhomb.toFindArea());

        Rectangle rectangle = new Rectangle("brown", 8, 11);
        System.out.println("Периметр прямоугольника = " + rectangle.perimeterQuadrangle());
        System.out.println("Площадь прямоугольника = " + rectangle.toFindArea());
        System.out.println("Диоганаль прямоугольника = " + rectangle.toFindDiagonal());


        Square square = new Square("white", 5, 5);
        System.out.println("    Периметр квадрата = " + square.perimeterQuadrangle());
        System.out.println("    Площадь квадрата = " + square.toFindArea());

        Right rightTriangle = new Right("red", 5, 6, 7);
        System.out.println("Периметер прямоугольного треугольника = " + rightTriangle.perimeterTriangles());
        System.out.println("Площадь прямоугольного треугольника = " + rightTriangle.toFindArea());
        System.out.println("Диагональ прямоугольного треугольника = " + rightTriangle.toFindDiagonal());

        Isosceles isoscelesTriangle = new Isosceles("red", 5, 5, 8, 4);
        System.out.println("    Периметер равнобедренного треугольника = " + isoscelesTriangle.perimeterTriangles());
        System.out.println("    Площадь равнобедренного треугольника = " + isoscelesTriangle.toFindArea());

        Equilateral equilateralTriangle = new Equilateral("red", 8, 8, 8);
        System.out.println("Периметер равностороннего треугольника = " + equilateralTriangle.perimeterTriangles());
        System.out.println("Площадь равностороннего треугольника = " + equilateralTriangle.toFindArea());

        System.out.println("Это прямоугольник? " + ShapeUtils.isRectangle(7,7));
        System.out.println("Это треугольник? " + ShapeUtils.isTriangles(8,8,8));
    }
}




