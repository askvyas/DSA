//Given an array of integers
//Find a sub array such that its sum is maximum
import java.util.*;
class MaxSubSum
{
  //function to find sum of an Array
  public static  int sum(int[] arr)
  {
    int n=arr.length;
    int s=0;
    for (int i=0;i<n;i++) {
      s+=arr[i];


    }
    return s;
  }
  public static int maxSum(int[] arr)
  {
    int res=arr[0];
    int n=arr.length;
    for (int i=0;i<n;i++) {
      int c=0;
      for (int j=i;j<n;j++) {
        c+=arr[j];
        res=Math.max(res,c);

      }

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
    System.out.println(maxSum(arr));

  }

  }
