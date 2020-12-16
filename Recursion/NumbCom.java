/*You are given an array of integers of length
n
n
 and an integer
k
k
. You have to now use your recursion + loops skills and solve this problem. The task is to print all the subsequences of length
k
k
 from the given array. See sample test for better understanding.
Note - In a subsequence order of elements remains the same.
*/
import java.util.*;
class NumbCom
{

  public static void getCom(int[] a,String res,int i,int n,int k)

  {
    if(k==0)
    {
      System.out.println(res);
    }
    for (int j=i;j<n;j++) {
       getCom(a,res+a[j]+" ",j+1,n,k-1);

    }

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    int k=sc.nextInt();
    getCom(arr,"",0,arr.length,k);


  }
}
