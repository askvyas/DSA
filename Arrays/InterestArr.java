import java.util.*;
  import java.io.*;

  public class InterestArr {
    public static void getInd(int[] arr,int n,int k)
    {
      int start=0;
      int end=n-1;


      int mini=n-1;
      int maxj=0,ct=0;
      while(start<end)
      {
        if(arr[start]+arr[end]==k)
        {
          mini=Math.min(mini,start);
          maxj=Math.max(maxj,end);
          ct++;
        }
        if(arr[start]+arr[end]<k)
        {
          start++;

        }
        else {
          end--;
        }

      }
      if(ct>0)
      {
        System.out.println(mini+" "+maxj);
      }
      else
      {
        System.out.println("no answer");
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
        int k=sc.nextInt();
        getInd(arr,n,k);

      }

    }
  }
