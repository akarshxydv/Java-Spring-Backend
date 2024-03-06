package OOPs.generics;

import java.util.Arrays;
//   it is restricted the data taking from the user
class WildCardArrayList<T extends Number> {
    private Object[] arr;
    private final int DEFAULT_SIZE=2;
    private int size=0;
    public WildCardArrayList(){
        this.arr= new Object[DEFAULT_SIZE];
    }
    public void add(T n){
        if(isFull()){
            reSize();
        }
        arr[size++]=n;
    }
    public T remove(){
        return (T)(arr[--size]);
    }
    public T get(int index){
        return (T)arr[index];
    }
    public void set(int num,int index){
        arr[index]=num;
    }

    private void reSize() {
        Object[] temp=new Object[arr.length * 2];
        //   copying the item into new array
        for(int i=0;i< arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }


    private boolean isFull() {
        return  size==arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
public class Main3 {
    public static void main(String[] args) {
        WildCardArrayList<Integer> arr1=new WildCardArrayList<>();
        arr1.add(12);
        arr1.add(23);
        arr1.add(45);
        arr1.add(67);
        arr1.add(89);

        System.out.println(arr1.get(1));
        System.out.println(arr1);

        //   it will show error because we are inserting the String in it and its parent extended to number only so..

//        WildCardArrayList<String> arr2=new WildCardArrayList<>();
//        arr2.add("hello");
//        arr2.add("Good Morning");
//
//        System.out.println(arr2);


    }

}