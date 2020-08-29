//Circular subarray
//ex {10,5,-5}
//All normal subarrays + {5,-5,10} , {-5,10} ,{-5,10,5}
import java.util.*;
class MaxCircSum
{
  //Naive Solution
  /*public static int maxSum(int[] arr,int n)
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
  }*/
  //Efficient Solution
  //Using Kadens algo
  //Simple Technique just find the max sum of normal subarrays
  //And for Circular sub array find the minimum sum of normal subarray
  // and subtract it from total array sum we will get the max Circular subarray
  //sum
  public static int sum(int[] arr,int n)
  {
    int res=0;
    for (int i=0;i<n;i++) {
      res+=arr[i];

    }
    return res;
  }
  public static int maxN(int[] arr,int n)
  {
    int res=arr[0];
    int maxEnd=arr[0];
    for (int i=1;i<n;i++) {
      maxEnd=Math.max(maxEnd+arr[i],maxEnd);
      res=Math.max(res,maxEnd);

    }
    return maxEnd;
  }
  //for max Circular sub array sum fin min of normal subarray sum
  public static int minN(int[] arr,int n)
  {
    int res=arr[0];
    int minEnd=arr[0];
    for (int i=1;i<n;i++) {
      minEnd=Math.min(minEnd-arr[i],minEnd);
      res=Math.min(res,minEnd);

    }
    return minEnd;
  }
  public static int maxSum(int[] arr,int n)
  {
    int cmax_sum=sum(arr,n)-minN(arr,n);
    int max_sum=maxN(arr,n);
    return Math.max(cmax_sum,max_sum);

  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    System.out.println(maxSum(arr,n));
    System.out.println(Math.min(-99,10));




  }

}
