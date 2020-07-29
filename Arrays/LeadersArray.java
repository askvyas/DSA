import java.util.*;
import java.io.*;

public class LeadersArray {
  public static void main(String args[]) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0)
    {
      int n=sc.nextInt();
      int tmp=0;
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int j=n-1;j>=0;j--)
      {
        if(j==n-1)
        {
          System.out.print(arr[j]+" ");
          tmp=arr[j];
        }
        else if(arr[j]>=arr[j+1])
        {
          if(arr[j]>=tmp)
          {
            System.out.print(arr[j]+" ");
            tmp=arr[j];
          }


        }
      }
      System.out.println();
      t--;
    }



  }
}
