package OOPs.abstraction.abstractClass;

public class Main {
    public static void main(String[] args) {
        Son aman=new Son(28);
        aman.familyBusiness();
        Daughter sara =new Daughter(25);
        sara.ownBusiness();

      //  Parent p1=new Parent()    you cannot create the instance of parent because its abstract class


    }
}
