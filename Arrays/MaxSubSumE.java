//Given an array of integers
//Find a sub array such that its sum is maximum
//Efficient Solution

import java.util.*;
class MaxSubSumE
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
  public static int maxSum(int[] arr,int s)
  {
    int n=arr.length;
    int res=arr[0];
    int maxEnd=arr[0];
    for (int i=1;i<n;i++) {
      maxEnd=Math.max(maxEnd+arr[i],arr[i]);
      res=Math.max(res,maxEnd);

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
    System.out.println(maxSum(arr,0));

  }

  }
