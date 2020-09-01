//Given a binary array, we need to find the minimum
//of number of group flips to make all array elements same.
//  In a group flip, we can flip any set of consecutive 1s or 0s.
import java.util.*;
class MinFlip
{
  public static void printFlips(int[] arr,int t)

  {
    for (int i=1;i<t;i++) {
      if(arr[i]!=arr[i-1])
      {
        if(arr[i]!=arr[0])
        {
          System.out.print("From "+i+" to ");
        }
        else {
          System.out.println(i-1);
        }

      }

    }
    if(arr[t-1]!=arr[0])
    {
      System.out.println(t-1);
    }

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] arr=new int[t];
    for (int i=0;i<t;i++) {
      arr[i]=sc.nextInt();

    }
    printFlips(arr,t);
  }
  //Sol

}
