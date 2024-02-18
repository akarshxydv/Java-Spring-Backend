package Arrays;

public class Intro {

    public static void main(String[] args) {
        int[] arr={3,2,1,5,2};

        //  sorting the array
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // find largest element
        int min=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>min){
                min=i;
            }
        }
        System.out.println(min);




        for(int a:arr){
            System.out.println(a);
        }


    }
}
