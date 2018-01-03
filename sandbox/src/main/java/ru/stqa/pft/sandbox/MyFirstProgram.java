package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        Square square = new Square(5);
        System.out.println("Площадь квадрата со стороной " + square.len + " равна " + square.area());

        Rectangle rectangle = new Rectangle(5, 14);
        System.out.println("Площадь прямоугольника со сторонами " + rectangle.a + " и " + rectangle.b + " равна " + rectangle.area());


        Point a = new Point(5, 10);
        Point b = new Point(10, 10);
        Point c = new Point(10, 10);
        System.out.println("Создана точка с координатами "+ a.x + " и " + a.y);

        System.out.println("Создана точка с координатами "+ b.x + " и " + b.y);

        Point z = new Point();
        System.out.println("Создана точка с координатами "+ z.x + " и " + z.y);
        a.distance(b);
        a.distance(z);
        b.distance(z);
        b.distance(a);
        b.distance(c);

    }

}
