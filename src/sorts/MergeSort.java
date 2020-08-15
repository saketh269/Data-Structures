package sorts;

public class MergeSort {
    public static void mergeSort(Comparable[] a, Comparable[] ar, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++)
            ar[i] = a[i];
        int j = lo, k = mid + 1;
        for (int i = lo; i <= hi; i++) {
            if (j > mid)
                a[i] = ar[k++];
            else if (k > hi)
                a[i] = ar[j++];
            else if (less(ar[k], ar[j]))
                a[i] = ar[k++];
            else
                a[i] = ar[j++];
        }
    }
    public static void msort(Comparable[] a, Comparable[] ar, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        msort(a, ar, lo, mid);
        msort(a, ar, mid + 1, hi);
        mergeSort(a, ar, lo, mid, hi);
    }
    public static void sort(Comparable[] a)
    {
        Comparable[] ar = new Comparable[a.length];
        msort(a, ar, 0, a.length - 1);
    }
    public static boolean less(Comparable y,Comparable z)
    {
        return y.compareTo(z)<0;
    }
    public static void print(Comparable[]a)
    {
        for(Comparable i:a)
            System.out.println(i + " ");
    }
    public static void main(String[] args)
    {
        MergeSort obj=new MergeSort();
        Comparable[] a={4,3,-9,1,0,-1};
        obj.sort(a);
        obj.print(a);

    }
}

