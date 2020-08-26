//given an array of stock prices we neeed to find the max profit that can be made
import java.util.*;
class StockBuy
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
  public static int maxPr(int[] arr,int start,int end)
  {
    if(end<=start)
    {
      return 0;
    }
    int profit=0;
    for (int i=start;i<end;i++) {
      for (int j=i+1;j<end;j++) {
        if(arr[j]>arr[i])
        {
          int curP=arr[j]-arr[i]+maxPr(arr,start,i-1)+maxPr(arr,j+1,end);
          profit=max(profit,curP);
        }

      }

    }
    return profit;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    System.out.print(maxPr(arr,0,n));

  }

}
