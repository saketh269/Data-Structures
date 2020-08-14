package sorts;

public class InsertionSort {
    public static void sort(Comparable[]a)
    {
        int n=a.length;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i;j>0;j--)
            {
                if(less(a[j],a[j-1]))
                {
                    swap(a,j,j-1);
                }
                else break;
            }
        }
    }
    private static boolean less(Comparable y,Comparable z)
    {
        return y.compareTo(z)<0;
    }
    private static void swap(Comparable[]a,int i,int j)
    {
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    private void print(Comparable[]a)
    {
        for(Comparable i: a)
            System.out.println(i +" ");
    }
    public static void main(String args[])
    {
        InsertionSort I=new InsertionSort();
        //Comparable[]a={9,5,7,3,2,5};
        Comparable[]a={'s','a','k','e','t','h'};
        I.sort(a);
        I.print(a);
    }
}
