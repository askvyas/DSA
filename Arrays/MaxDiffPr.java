import java.util.*;
  import java.io.*;

  public class MaxDiffPr {
    public static int maxD(int[] arr,int n)
    {
      int max=0;
      for (int i=0;i<n;i++) {
        {
          for (int j=i+1;j<n;j++) {
            int tm=Math.abs(arr[i]-arr[j])+Math.abs(i-j);
            if(tm>max)
            {
              max=tm;
            }

          }
        }

      }
      return  max;

    }
    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();

        }
        System.out.println(maxD(arr,n));
        }

    }
  }
