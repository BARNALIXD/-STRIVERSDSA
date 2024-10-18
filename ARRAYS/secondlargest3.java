import java.io.*;
class Test
{
    static private int secondSmallest(int[] arr,int n)
    {
        if (n < 2)
        {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i ;
        for( i = 0; i < n; i++)
        {
            if (arr[i] < small)
            {
                second_small = small;
                small = arr[i];
            }
        }
        return second_small;
    }
    stactic private int secondLargest(int[] arr, int n)
    {
        if(n<2)
        return -1;
        int large = Integer.MIN_VALUE;
        int second_largest - Integer.MIN_VALUE;
        int i ;
        for ( i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                
            }
        }
    }
}