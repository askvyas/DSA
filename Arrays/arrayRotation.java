import java.util.*;
import java.io.*;

public class ArrayRotation
{
    static void reverseArray(int arr[], int start,
                             int end)
    {
        while (start < end)
        {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
         }
    }

    static void rightRotate(int arr[], int d, int n)
    {
       reverseArray(arr, 0, n - 1);
       printArray(arr,n);
       System.out.println();
       reverseArray(arr, 0, d - 1);
       printArray(arr,n);
       System.out.println();
       reverseArray(arr, d, n - 1);
       printArray(arr,n);
       System.out.println();
    }

    static void printArray(int arr[], int size)
    {
       for (int i = 0; i < size; i++)
          System.out.print(arr[i] + " ");
    }

    public static void main (String[] args)
    {
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    while(t!=0)
    {
      int n,k;
      n=sc.nextInt();
      k=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      if((k>=0)&&(k<n)){
      rightRotate(arr,k,n);
      printArray(arr, n);
      System.out.println();
    }
      else if(k>=n)
      {

      rightRotate(arr,(k%n),n);
      printArray(arr, n);
      System.out.println();

      }
      else
      {
        printArray(arr, n);

      }
      t--;

    }

    }
}
