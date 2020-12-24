/*You are given an array consisting of
N
 integers and integer
K
. Find number of pairs that have difference value equal to K.*/
import java.util.*;
class IntAr
{
  public static int binSear(int[] arr,int l,int h,int k)
  {
    if(h>=l)
  {
    int mid=l+(h-l)/2;
    if(arr[mid]==k)
    {
      return mid;
    }
    else if(k<arr[mid])
    {
      return binSear(arr,l,mid-1,k);
    }
    else {
      return binSear(arr,mid+1,h,k);
    }
  }
  return -1;
  }
  public static int getPair(int[] arr,int n,int k)
  {
    int res=0;
    for (int i=0;i<n;i++) {
      if(binSear(arr,i,n-1,arr[i]+k)!=-1)
      {
        res++;

      }

    }
    return res;
  }


  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();


    }
    Arrays.sort(arr);
    System.out.println(getPair(arr,n,k));


  }
}
