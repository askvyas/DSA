//Given  a binary Array find the maximum consecutive ones
import java.util.*;
class MaxCons1
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int tmp=0;
    for (int i=0;i<n;i++) {

      arr[i]=sc.nextInt();
      int prev=arr[i];
      if((arr[i]==1)&&(prev==1))
      {
        c++;
      }
      else {
        c=0;
      }

    }
  }
}
