//Circular subarray
//ex {10,5,-5}
//All normal subarrays + {5,-5,10} , {-5,10} ,{-5,10,5}
import java.util.*;
class MaxCircSum
{
  //Naive Solution
  public static int maxSum(int[] arr,int n)
  {
    int res=arr[0];
    for (int i=0;i<n;i++) {
      int cur_max=arr[i];
      int cur_sum=arr[i];
      for (int j=1;j<n;j++) {
        int idx=(i+j)%n;
        cur_sum+=arr[idx];
        cur_max=Math.max(cur_max,cur_sum);

      }
      res=Math.max(res,cur_max);

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
    System.out.println(maxSum(arr,n));



  }

}
