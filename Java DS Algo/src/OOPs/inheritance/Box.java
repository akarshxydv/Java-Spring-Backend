package OOPs.inheritance;

public class Box {
    double l;
    double b;
    double h;

    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    public Box(double side){
        this.l=side;
        this.b=side;
        this.h=side;
    }

    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

}
