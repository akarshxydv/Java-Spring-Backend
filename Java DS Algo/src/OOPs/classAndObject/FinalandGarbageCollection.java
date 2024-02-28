package OOPs.classAndObject;

public class FinalandGarbageCollection {
    //  final you cannot change the value or reassign it
    public static void main(String[] args) {


        final int a = 56;
        //a=45;  getting error

        final A aa = new A();
        aa.as=12;   //  her value changing but you cannot reassign the new object
       // aa=new A();    getting error
    }

}
class A{
    int as=9;

    //  here in java object and variable are destroying automatically by garbage collection and finalize keyword used to do it
}
