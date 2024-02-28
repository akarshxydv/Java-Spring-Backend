package OOPs.classAndObject.abstraction.abstractClass;

public abstract class Parent {

    //   here you can add the non abstract method to and also constructor
    int age;
    public Parent(int age){
        this.age=age;
    }

    abstract void familyBusiness();
    abstract void ownBusiness();
}
