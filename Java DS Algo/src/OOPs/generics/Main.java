package OOPs.generics;

import java.util.Arrays;

class CustomArrayList{
        private int[] arr;
        private final int DEFAULT_SIZE=2;
        private int size=0;
        public CustomArrayList(){
            this.arr= new int[DEFAULT_SIZE];
        }
        public void add(int n){
            if(isFull()){
                reSize();
            }
            arr[size++]=n;
        }
        public int remove(){
            return arr[--size];
        }
        public int get(int index){
            return arr[index];
        }
        public void set(int num,int index){
            arr[index]=num;
        }

    private void reSize() {
            int[] temp=new int[arr.length * 2];
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
public class Main {
    public static void main(String[] args) {
            WildCardArrayList arr1=new WildCardArrayList();
            arr1.add(12);
            arr1.add(23);
            arr1.add(45);
            arr1.add(67);
            arr1.add(89);

        System.out.println(arr1.get(1));
        System.out.println(arr1);
    }

}

