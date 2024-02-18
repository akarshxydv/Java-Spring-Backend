package Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr={1,7,5,7,1,6};
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=arr[i-1];
                largest=arr[i];


            }else if(arr[i]>secondLargest && largest !=arr[i]){
                secondLargest=arr[i];
            }else secondLargest=-1;
        }

        System.out.println(secondLargest);

    }
}
