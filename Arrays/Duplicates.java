//Remove the duplicates from a sorted array of integers
import java.util.*;
class Duplicates
{
  //gfg Method which gives just the number of distinct elements
  public static int reverse(int[] arr,int n)
  {
    //Method 1
    int[] temp=new int[n];
    temp[0]=arr[0];
    int res=1;
    for (int i=1;i<n;i++) {
      if(temp[res-1]!=arr[i])
      {
        temp[res]=arr[i];
        res++;
      }

    }
    return  res;


  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    //ASKV's Method without function
    //int prev=0;

    /*for (int i=0;i<n;i++) {
      if(prev!=arr[i])
      {
        System.out.println(arr[i]);
        prev=arr[i];
      }


    }*/
    System.out.println(reverse(arr,n));

  }
}
