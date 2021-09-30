import java.io.*;
import java.util.*;
public class insertion_sort 
{
    public static void isort(int a[], int n)
    {
        int j;
        int k;
        for(int i = 1; i < n; i++) 
        {
            j = a[i];
            k = i - 1;
            while(k >= 0 && a[k] > j)
            {
                a[k+1] = a[k];
                k--;
            }
            a[k+1] = j;
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
        isort(a, n);
    }
}