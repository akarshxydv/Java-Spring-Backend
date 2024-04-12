package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int n=12;
        boolean isElementNotFound=true;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==n){
                    isElementNotFound=false;
                    System.out.println("Element Found");
                }
        }
        if(isElementNotFound){
            System.out.println("Element Not Found");
        }


    }

}
