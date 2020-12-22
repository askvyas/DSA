import java.util.*;
class RotS
{
  public static void rotateByO(int[] arr,int n)
  {}
  public static int binS(int[] arr,int l,int r,int x)
  {
    if(l<=r)
    {
      int mid=l+ (r-l) / 2;
      if(arr[mid]==x)
      {
        return mid;
      }
      if(arr[mid]>x)
      {
        return binS(arr,l,mid-1,x);
      }
      if(arr[mid]<x)
      {
        return binS(arr,mid+1,r,x);
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      int n=sc.nextInt();
      int[] arr=new int[n];
      for (int i=0;i<n;i++) {
        arr[i]=sc.nextInt();

      }
      int x=sc.nextInt();
      System.out.println(binS(arr,0,n-1,x));


    }
  }
}
