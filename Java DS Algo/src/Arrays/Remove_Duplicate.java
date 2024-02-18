package Arrays;
import java.util.*;
public class Remove_Duplicate {
    public static int removeDuplicates(int[] nums) {

        List<Integer> arrU=new ArrayList<>();
        int j=0;
        for(int i:nums){
            if(!arrU.contains(i)){
                arrU.add(i);
                nums[j]=i;
                j++;
            }

        }
        return arrU.size();

    }
    public static void main(String[] args) {
        int [] arr={1,1,2};
        int size=removeDuplicates(arr);
        System.out.println(size);

    }
}
