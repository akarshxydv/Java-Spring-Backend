package OOPs.others;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr1.add(i);
        }
        arr1.forEach((item)-> System.out.print(item*2+ " "));
        System.out.println();
        Operation sum=(a,b)->a+b;
        Operation minus=(a,b)->a-b;
        Operation multiply=(a,b)->a*b;
        Operation division=(a,b)->a/b;
        int suum=Operatoter(3,4,sum);
        System.out.println(suum);


    }
    private static int Operatoter(int a, int b,Operation op){
        return op.operate(a,b);
    }
}
interface Operation{
    int operate(int a,int b);
}
