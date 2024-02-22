package OOPs.classAndObject;

public class intro {
    public static void main(String[] args) {
        //store 5 name
        String[] name=new String[5];
        // data of 5 student :{name,sub,marks}
        float [] marks=new float[5];
        //  and so on;

        Students s1=new Students();
        s1.marks=79.0f;
        s1.name="Akarsh Yadav";
        s1.rollNo=5;

        System.out.println(s1.name + " "+s1.marks+" "+s1.rollNo);
    }

}

class Students{
    int rollNo;
    float marks;
    String name;
}
