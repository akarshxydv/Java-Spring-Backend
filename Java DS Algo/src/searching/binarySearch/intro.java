package searching.binarySearch;

import java.util.Arrays;

public class intro {

    public static int binarySearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target < arr[mid]) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
            int[] arr1={};
            int[] arr2={1};
            int[]  arr3={1,2,3,4,5,5,6,6,7,7,7,8,9,0};

        Arrays.sort(arr3);

//        System.out.println(binarySearch(arr1,1));
//        System.out.println(binarySearch(arr2,1));
//        System.out.println(Arrays.toString(arr3));
        System.out.println(binarySearch(arr3,6));

    }
}
