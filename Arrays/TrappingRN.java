
//Naive Solution by GFG
import java.util.*;
class TrappingRN
{
  public static int max(int a,int b)
  {
    if(a>b)
    {
      return a;
    }
    else if(b>a)
    {
      return b;
    }
    return a;
  }
  public static int min(int a,int b)
  {
    if(a>b)
    {
      return b;
    }
    else if(b>a)
    {
      return a;
    }
    return a;
  }


  public static int getWater(int[] arr,int n)
  {
    int res=0;
    for (int i=1;i<n-1;i++) {
      int lmax=arr[i];
      for (int j=0;j<i;j++) {
        lmax=max(lmax,arr[j]);

      }
      int rmax=arr[i];
      for (int j=i+1;j<n;j++) {
        rmax=max(rmax,arr[j]);

      }
      res=res+(min(lmax,rmax)-arr[i]);



    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    System.out.print(getWater(arr,n));


  }

}
