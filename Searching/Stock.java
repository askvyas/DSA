import java.util.*;
class Stock
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] arr=new int[n];
      arr[0]=sc.nextInt();
      int prev=arr[0];
      int sum=0;
      for (int i=1;i<n;i++) {
        arr[i]=sc.nextInt();
        if(arr[i]>prev)
        {
          sum+=(arr[i]-prev);
        }
        prev=arr[i];


      }
      System.out.println(sum);
    }
  }
}
