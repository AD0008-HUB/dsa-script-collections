import java.io.*;
import java.util.*;
public class bubble_sort 
{
    public static void bsort(int a[], int n)
    {
        int t = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < (n-i); j++)
            {
                if(a[j-1] > a[j])
                {
                    t = a[j-1];
                    a[j-1] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + ", ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int a[] = new int[100];
        System.out.println("Enter length : ");
        n = sc.nextInt();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        bsort(a, n);
    }
}
