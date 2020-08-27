//Given  a binary Array find the maximum consecutive ones
import java.util.*;
class MaxCons1
{
  //Naive Solution

  /*public static int getC(int[] arr)
  {
    int res=0;
    int n=arr.length;
    for (int i=0;i<n;i++) {
      int cur=0;
      for (int j=0;j<n;j++) {
        if(arr[j]==1)
        {
          cur++;

        }
        else {
          res=Math.max(cur,res);
          break;
        }

      }



    }
    return  res;
  }*/
  public static int getC(int[] arr)
  {
    int res=0;
    int c=0;
    int n=arr.length;
    for (int i=0;i<n;i++) {

      if(arr[i]==0)
      {
        c=0;
      }
      else {
        c++;
        res=Math.max(c,res);
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
      System.out.println(getC(arr));

  }
}
