import java.util.*;
class Majori
{
  public static  int isMaj(int[] arr,int n)
  {
    int max_i=0,count=0;
    for (int i=0;i<n;i++) {
      if(arr[max_i]==arr[i])
      {
        count++;
      }
      else {
        count--;
      }
      if(count==0)
      {
        max_i=i;
        count=1;
      }

    }
    count=0;
    for (int i=0;i<n;i++) {
      if(arr[max_i]==arr[i])
      {
        count++;
      }

    }
    if(count>n/2)
    {
      return arr[max_i];
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
      System.out.println(isMaj(arr,n));

    }

  }
}
