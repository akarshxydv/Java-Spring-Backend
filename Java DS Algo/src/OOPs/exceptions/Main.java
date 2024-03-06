package OOPs.exceptions;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println("Hello");
            int c=divide(a,b);
            System.out.println("Good morning");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will execute always no matter exception encounter or not");
        }
    }
    static int divide(int a,int b) throws Exception{
        if(b==0){
            throw new MyException("B should not be 0");
        }
        return a/b;
    }


}
