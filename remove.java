import java.util.*;

public class remove {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,,2,3,1,2,3,,2,4,5,6};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate element is ");
        for (int i = ; i < k ; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
static int removeDuplicates(int[] arr) {
    HashSet <integer> set = new HashSet <> ();
        for ( int i = ; i <arr.length ; i++){
            set.add(arr[i]);

        }
        int k = set.size();
        int j = 0;
        for (int x : set){
            arr[j++] = x;

        }
        return k;
    }
}