//Given an array of integers in which all numbers appear even number of times
//we need to find the number that appears odd number of times
import  java.util.*;
class OddOcc
{
  public static int findodd(int[] arr,int n)
  {
    int res=0;
    for(int i=0;i<n;i++)
    {
      res=res^arr[i];
    }
    return res;

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    System.out.print(findodd(arr, n));

  }
}
