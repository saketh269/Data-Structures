package sorts;
import java.util.Collections;
import java.util.Random;

public class QuickSort {
    public static int partition(Comparable[]a,int lo,int hi)
    {
        int i=lo,j=hi+1;
        while (true)
        {
            while (less(a[++i], a[lo]))
            {
                if (i == hi)
                    break;
            }
            while(less(a[lo],a[--j]))
            {
                if(j==lo)
                    break;
            }
            if(i>=j)
                break;
            swap(a,i,j);
        }
        swap(a,lo,j);
        return j;
    }
    public static void sort(Comparable[]a)
    {
        //StdRandom.shuffle(a)
        qSort(a,0,a.length-1);
    }
    public static void qSort(Comparable[]a,int lo,int hi)
    {
        if(hi<=lo)
            return;
        int i=partition(a,lo,hi);
        qSort(a,lo,i-1);
        qSort(a,i+1,hi);
    }
    public static boolean less(Comparable y,Comparable z)
    {
        return y.compareTo(z)<0;
    }
    public static void swap(Comparable[]a,int i,int j)
    {
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void print(Comparable[]a)
    {
        for(Comparable i: a)
            System.out.println(i+ " ");
    }
    public static void main(String args[])
    {
        QuickSort Q=new QuickSort();
        Comparable[]a={1,5,6,8,9,3,2,7};
        Q.sort(a);
        Q.print(a);
    }
}