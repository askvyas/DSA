//Max Lenght of the subarray which contains alternate even odd integers
import java.util.*;
class EvenOdd
{
  //Naive Solution
  /*public static int maxL(int[] arr)
  {
    int n=arr.length;
    res=0;
    for (int i=0;i<n;i++) {
      int cur=1;
      for (int j=i+1;j<n;j++) {
        if(((arr[j]%2==0)&&(arr[j-1]%2!=0))||(arr[j]%2!=0)&&(arr[j-1]%2==0)))
        {
          cur++;
        }
        else {
          break;

        }

      }
      res=Math.max(res,cur);

    }
    return res;
  }*/
  //implemented using Kadens algo
  public static int maxL(int[] arr)
  {
    int n=arr.length;
    int res=1;
    int cur=1;
    for (int i=1;i<n;i++) {
      if(((arr[i]%2==0)&&(arr[i-1]%2!=0))||(arr[i]%2!=0)&&(arr[i-1]%2==0))
      {
        cur++;
      }
      else
      {
        cur=1;
      }
      res=Math.max(res,cur);


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
    System.out.println(maxL(arr));


  }
}
