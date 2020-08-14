package sorts;

public class SelectionSort {
    int i,j,min;
    public static void sort(Comparable[]a)
    {
        int i,j,min;
        int n=a.length;
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(less(a[j],a[min]))
                    min=j;
            }
            exchange(a,i,min);
        }
    }
    private static boolean less(Comparable y,Comparable z)
    {
        return y.compareTo(z)<0;
    }
    private static boolean exchange(Comparable[]a,int i,int min)
    {
        Comparable swap=a[i];
        a[i]=a[min];
        a[min]=swap;
        return false;
    }
    private void print(Comparable[]a)
    {
        for(Comparable i: a)
            System.out.println(i +" ");
    }
    public static void main(String args[])
    {
        SelectionSort S=new SelectionSort();
        Comparable[]a={9,5,7,3,2,5};
        
        S.sort(a);
        S.print(a);
    }
}
