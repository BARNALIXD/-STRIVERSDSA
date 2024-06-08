
import java.util.*;

public class largestbrut{
    public static void main(String[] args) {
        
        int arr1[] = {3,9,6,7};
        System.out.println("the largest number in the array1:" + sort(arr1));
    
        int arr2[]= {2,4,1,6};
        System.out.println("the largest number in array 2:" + sort(arr2));
    }
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr [arr.length -1];
    }
    
}
