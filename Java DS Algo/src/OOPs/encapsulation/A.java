package OOPs.encapsulation;

public class A {
   private int num;
    String name;
    int[] arr;
    public A( int num,String name) {
        this.num=num;
        this.name = name;
        this.arr = new int[10];
    }

    public int  getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
