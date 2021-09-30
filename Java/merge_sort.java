import java.io.*;
public class merge_sort 
{
    public static int[] msort(int a[])
    {
        if(a.length <= 1) // recursion base condition
        {
            return a;
        }
        int n = a.length;
        int m = n / 2;
        int l[] = new int[m]; 
        int r[];
        if(n % 2 == 0) 
        {
            r = new int[m];
        }
        else
        {
            r = new int[m+1];
        }
        for(int i = 0; i < m; i++) // storing left side of array
        {
            l[i] = a[i]; 
        }
        for(int j = 0; j < r.length; j++) // storing right side of array
        {  
           r[j] = a[m+j]; 
        }
        int res[] = new int[n]; // join both arrays
        l = msort(l); // call recursion
        r = msort(r); // call recursion
        res = merge(l, r);
        return res;
    }
    public static int[] merge(int l[], int r[])
    {
        int len = l.length + r.length;
        int res[] = new int[len];
        int lp = 0, rp = 0, resp = 0; // left most right most and result 
        while(lp < l.length || rp < r.length)
        {
            if(lp < l.length && rp < r.length) // simultaneously for left most and right most
            {
                if(l[lp] < r[rp])
                {
                    res[resp++] = l[lp++]; // store left most
                }
                else
                {
                    res[resp++] = r[rp++]; // store right most
                }
            }
            else if(lp < l.length) // elements in only left array 
            {
                res[resp++] = l[lp++]; 
            }
            else if(rp < r.length) // elements in only right array 
            {
                res[resp++] = r[rp++]; 
            }
        }
        return res;
    }
    public static void print(int a[])
    {
        int n = a.length;
        System.out.println("Sorted array : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int a[] = {75, 4, 36, 2, 11, 90};
        a = msort(a);
        print(a);
    }
}