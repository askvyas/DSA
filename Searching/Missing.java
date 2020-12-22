/*Missing in AP
Arithmetic expression was an interesting concept that we learned in maths. What about solving a problem around that. Let's say I give you
N
 elements and I tell you that the elements are representing AP(Arithmetic Progression). But you realize that one element from this AP is missing and you want to find out the missing element. It is easy to find out the missing one for a human but can you write down a program that does this task of finding a missing element from the AP?*/
import java.util.*;
class Missing
{
  public static int commD(int[] arr,int n)
  {
    int cd=arr[1]-arr[0];
    int td=0;
    int idx=0;
    for (int i=1;i<n-1;i++) {
      td=arr[i+1]-arr[i];
      if(td!=cd)
      {
        idx=i;


      }

        cd=td;



    }
    return (arr[idx-1]+cd);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      int n=sc.nextInt();
      int[] arr =new int[n];
      int s=0;
      for (int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
        s+=arr[i];


      }
      System.out.println(commD(arr,n));




    }

  }
}
