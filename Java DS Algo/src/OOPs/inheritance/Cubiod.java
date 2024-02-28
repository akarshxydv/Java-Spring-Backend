package OOPs.inheritance;

public class Cubiod extends Box {
    double noOfBox;
    double totalArea;
    public Cubiod(double l, double b, double h) {
        super(l, b, h);
    }

    double area(){
        return this.l*this.b*this.h;
    }
    public Cubiod(double side,double noOfBox){
        super(side);
        this.totalArea=area()*noOfBox;
        System.out.println(this.totalArea);

    }
}
