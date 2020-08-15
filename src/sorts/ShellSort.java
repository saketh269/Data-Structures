package sorts;

public class ShellSort {
    public static void sSort(Comparable[]a)
    {
        int i,j,n,gap;
        n=a.length;
        gap=1;
        while(gap<n/3)
            gap=3*gap+1;
        while(gap>=1){
            for(i=gap;i<n;i++){
                for(j=i;j>=gap&&less(a[j],a[j-gap]);j-=gap)
                    swap(a,j,j-gap);
            }
            gap=gap/3;
        }
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
    public static void print(Comparable[]a){
        for(Comparable i:a)
            System.out.println(i + " ");
    }
    public static void main(String args[])
    {
        ShellSort S=new ShellSort();
        Comparable[]a={5,9,3,7,8,2,1,6,56,564,89,234,457,22,10,245,53,023};
        //Comparable[]a={'s','a','k','e','t','h'};
        S.sSort(a);
        S.print(a);
    }
}