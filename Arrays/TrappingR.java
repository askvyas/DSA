//Trapping Rain Water Problem My Version 1
//Not Working for some test Cases
import  java.util.*;
class TrappingR
{
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

  public static int findU(int[] arr,int n)
  {
    int m=min(arr[0],arr[n-1]);
    int t=m*(n-2);
    int s=0;
    for (int i=1;i<n-1;i++) {
      s+=arr[i];

    }
    return t-s;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    System.out.print(findU(arr,n));


  }
}
