import java.util.*;

public class tuf {
    public static int majorityelement(int []v) {
        //six=ze of the given array
        int n = v.length;

        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if (v[j] == v[i]) {
                    cnt++;
                }
            }
            if ( cnt > (n/2))
            return v[i];
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityelement(arr);
        System.out.println("The majority element is:" +ans);
    }
}