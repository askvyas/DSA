//given sorted Array/
//In the new pattern, array elements have to be arranged alternatively i.e first element should be the maximum value present in the array, the second element should be the minimum value, the third element should be the second maximum, forth the second minimum and so. Can you write a program to rearrange the array in the new pattern?
import java.util.*;
  import java.io.*;

  public class Arrange {
    public static void sorT(int[] arr)
    {
      int n=arr.length;
      int[] tmp=arr.clone();
      if(n==2)
      {
        tmp[0]=arr[1];
        tmp[1]=arr[0];
      }
      else{
        for (int i=n-1;i>n/2;i--) {
          for (int j=0;j<n;j+=2) {
            tmp[j]=arr[i];
            i--;

          }

        }
        for (int i=0;i<n/2;i++) {
          for (int j=1;j<n;j+=2) {
            tmp[j]=arr[i];
            i++;

          }
        }


      }
      for(int i=0;i<n;i++)
      {
        System.out.print(tmp[i]+" ");
      }

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
        sorT(arr);


      }

    }
  }
