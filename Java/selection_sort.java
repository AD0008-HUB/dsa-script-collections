import java.io.*;
import java.util.*;
public class selection_sort 
{
    public static void ssort(int a[], int n)
    {
        for(int i = 0; i < n-1; i++)
        {
            int min = i;
            for(int j = i+1; j < n; j++)
            {
                if(a[j] < a[min])
                {
                   min = j;
                }
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
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
        ssort(a, n);
    }
}
