package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        Square square = new Square(5);
        System.out.println("Площадь квадрата со стороной " + square.len + " равна " + square.area());

        Rectangle rectangle = new Rectangle(5, 14);
        System.out.println("Площадь прямоугольника со сторонами " + rectangle.a + " и " + rectangle.b + " равна " + rectangle.area());

        Point g = new Point(1, 1);
        Point u = new Point();
        System.out.println("Создана точка с координатами " + g.x + " и " + g.y);
        Point f = new Point(5, 0);
        System.out.println("Создана точка с координатами " + f.x + " и " + f.y);

        System.out.println("Расстояние между двумя точками равно " + u.distanceToPoint(f));

    }

}
