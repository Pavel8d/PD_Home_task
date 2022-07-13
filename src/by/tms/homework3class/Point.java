package by.tms.homework3class;

/*Создать класс Point, описывающий точку в двумерных координатах.
Полями этого класса должны быть координаты x и y.
Класс должен иметь один конструктор, принимающий координаты x и y.
Создать в классе Point метод distance, принимающий другой объект Point и определяющий расстояние
 до неё (можно использовать класс Math).

Используя класс точки, создать класс Rectangle, описывающий прямоугольник
 (у Rectangle должно быть минимум два конструктора).
В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
Создать следующие методы в классе Rectangle:
- Высчитывающий площадь прямоугольника
- Высчитывающий периметр прямоугольника
- Высчитывающий длину диагонали

Написать тестовый класс с методом main, демонстрирующим создание объекта класса Rectangle
 и применение вышеперечисленных методов.
*/

public class Point {
    private double x;
    private double y;

    public Point(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }

    public double distance(Point point1, Point point2) {
        return Math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + (point1.y - point2.y) * (point1.y - point2.y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

