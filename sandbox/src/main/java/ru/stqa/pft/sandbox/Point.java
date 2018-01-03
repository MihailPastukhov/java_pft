package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public boolean isEqual(Point a){
        if ((this.x==a.x)&&(this.y==a.y)){
            return true;
        }
        else return false;
    }

    public boolean isZero(Point a){
        if (((this.x==0)&&(this.y==0))||((a.x==0)&&(a.y==0))){
            return true;
        }
        else return false;
    }

    public double distance(Point a){
        double dist=0;
        if (isEqual(a))
            dist=0;

        else{
            dist=Math.sqrt(Math.pow((this.x - a.x),2) + Math.pow((this.y - a.y),2));
            if (isZero(a)){
                System.out.println("Расстояние от начала координат до точки с координатами " + this.x + " и " + this.y + " = " + dist);
            }
            else {
                System.out.println("Расстояние между двумя точками, введенными ранее = " + dist);
            }
        }
        return dist;
    }

}
