package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        double len = 5.0;
        System.out.println("Площадь квадрата со стороной " + len + " равна " + area(len));

        double a = 5.0;
        double b = 15.0;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a, b));

    }

    private static double area(double len) {
        return len * len;
    }

    private static double area(double a, double b) {
        return a * b;
    }


}
