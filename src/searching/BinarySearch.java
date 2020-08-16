package searching;

import java.util.Arrays;

public class BinarySearch {
    public static int bSearch(int[]a,int key)
    {
        int lo=0,hi=a.length-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if (key==a[mid])
                return mid+1;
            else if(key<a[mid])
                hi=mid-1;
            else if(key>a[mid])
                lo=mid+1;
            else
                return mid+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch B=new BinarySearch();
        int[]a={1,2,5,8,56};
        int key=56;
        //Arrays.sort(a);
        int res=B.bSearch(a,key);
        System.out.println(res);
    }
}
/*The input should be in ascending order if not
 use Array.sort() function to sort in order
 the final output displays the position of the
 key value*/

