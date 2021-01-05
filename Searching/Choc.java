import java.util.*;
class Choc
{
  public static int binS(int arr[],int l,int h,int n,int k)
  {
    int res=0;
    while (l<=h) {
      int mid=l+(h-l)/2;
      if(k>=arr[mid])
      {
        res=mid+1;
        l=mid+1;

      }
      else {
        h=mid-1;
      }


    }
    return res;
  }
  public static int getChoc(int[] arr,int n,int t)
  {
    int cnt=0;
    for (int i=0;i<n;i++) {
      if(t>=arr[i])
      {
        cnt++;
        t=t-arr[i];
      }


    }
    return cnt;

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    Arrays.sort(arr);
    int q=sc.nextInt();
    while (q-->0) {
      int t=sc.nextInt();
      //System.out.println(getChoc(arr,n,t));
      System.out.println(binS(arr,0,n-1,n,t));


    }

  }
}
