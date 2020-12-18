/*Tina is a computer scientist and a part of her work requires her to find first occurence of
1 in the array consisting of 0 and
1. One good news is that array is sorted. Tina is sure that a sorted array will give solution to this problem in more efficient way. Can you write code to find first occurence of
1 in the array consisting of 0 and 1.*/
import java.util.*;
class TransPt
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      int n=sc.nextInt();
      int[] arr=new int[n];
      int res=-1;
      int ps=0;

      for (int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
        ps+=arr[i];



      }
      for (int i=0;i<n;i++) {
        if(ps==0)
        {
          break;
          
        }
        if(arr[0]==1)
        {
          res=0;
          break;

        }
        if((arr[i]==0)&&(arr[i+1]==1))
        {
        res=i+1;
        break;


        }


      }
      System.out.println(res);


    }

  }
}
