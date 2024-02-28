package OOPs.polymorphism;

public class Main {
    public static void main(String[] args) {

        Shape shape=new Shape();
        Circle circle=new Circle();
        shape.area();
        shape.toString();
        circle.area();
        Shape rectangle=new Rectangle();
        rectangle.area();
        rectangle.toString();
    }

}
