package OOPs.classAndObject;

public class Static {

   static int a=5;

   static class Innerclass{

   }

    public static void main(String[] args) {
        a=34;
        jira j1=new jira("Akarsh",5);
        jira j2=new jira("Aviral",3);

        System.out.println(j1.name);
        System.out.println(j2.i);
        System.out.println(j1.i);

    }



    //  static keyword is direct related to class
    //  a non-static method cannot be called in static method because it does not having ref to class for calling we need to make an object of class.

    void message(){
        System.out.println("hello world");
    }

}

class jira{
    static int i =5;
    String name;
    jira(String name, int i){
        this.name=name;
        jira.i=i;
    }
    void message(){
        System.out.println("Hello world");
    }

}
