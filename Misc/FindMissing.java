//Given an array of integers in which all numbers appear  (from 1 to n)
//we need to find the number that is missing


import java.util.*;
class FindMissing
{
  static int findmiss(int a[], int n)
  {
      int x1 = a[0];
      int x2 = 1;

      for (int i = 1; i < n; i++)
          x1 = x1 ^ a[i];

      for (int i = 2; i <= n + 1; i++)
          x2 = x2 ^ i;

      return (x1 ^ x2);
  }

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    System.out.print(findmiss(arr, n));


  }
}
