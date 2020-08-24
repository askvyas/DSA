//Given an Array find the maximum value of arr[j]-arr[i]
//Such That j>i

import java.util.*;
class MaxDiff
{
  //public static int maxD(int[] arr,int n) //My Solution O(n^2) Also can be done using Recursion
  //{
    //int max=arr[1]-arr[0];
    //for (int i=0;i<n;i++) {
      //for (int j=i+1;j<n;j++) {
        //if(arr[j]-arr[i]>max)
        //{
        //  max=arr[j]-arr[i];
        //}

      //}

    //}
    //return max;
  //}
  public  static int max(int a,int b)
  {
    if(a>b)
    {
      return  a;
    }
    else if(b>a)
    {
      return b;
    }
    return  a;
  }
  public static int min(int a,int b)
  {
    if(a>b)
    {
      return  b;
    }
    else if(b>a)
    {
      return a;
    }
    return  a;
  }
  public static int maxD(int[] arr,int n) //Efficient Solution
  {
    int res=arr[1]-arr[0];
    int minVal=arr[0];
    for (int j=1;j<n;j++) {
      res=max(res,arr[j]-minVal);
      minVal=min(minVal,arr[j]);

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
  System.out.print(maxD(arr,n));

}
}
