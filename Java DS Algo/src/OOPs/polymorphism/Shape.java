package OOPs.polymorphism;

public class Shape {

    //  if we final method here it will be not override
    //  if you final to class it will be implicit final to all method

    void area(){
        System.out.println("I am in Shape");
    }
    void print(){
        System.out.println("this is called when you print somethings");
    }

    @Override
    public String toString() {
        return "Hello shape";
    }
}
