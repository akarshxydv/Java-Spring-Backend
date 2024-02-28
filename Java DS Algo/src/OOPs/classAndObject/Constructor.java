package OOPs.classAndObject;

public class Constructor {
    public static void main(String[] args) {
          Person p1=new Person();
        p1.message();
        Person p2=new Person("Aviral","28/12/14");
        p2.message();
        Person ansh=new Person(p2);
        ansh.message();
        Person abhi=ansh;   //  here if you change the value of ansh it will reflect to abhi too and vice-versa; because you are creating the copy of refrence not the object;

    }

}

class Person{

    private String name;
   private String dob;

   void message(){
       System.out.println("Hello my name is "+ this.name + " and my date of birth is "+this.dob);
   }

    Person(){
        //  here we are calling constructor from another constructor
        this("Akarsh","30/09/03");

    }
    Person(Person other){
       this.name=other.name;
       this.dob=other.dob;
    }
    Person(String name,String dob){
       this.name=name;
       this.dob=dob;
    }

}
