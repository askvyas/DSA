/*Peak House

There is a society in Gurgaon where everyone thinks that they have a taller house than their neighbors.  Consider all the house are in the same line, so everyone will have two neighbors on their left and right except the corner ones who have just one neighbor. Now you are given the task of giving the position of one such house which satisfies this condition of being taller than their neighbors.
*/
import java.util.*;
class Peak
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      int n=sc.nextInt();
      int[] arr=new int[n];
      for (int i=0;i<n;i++) {
        arr[i]=sc.nextInt();


      }
      for (int i=1;i<n-1;i++) {
        if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1]))
        {
          System.out.println(i);
          break;

        }
        else if(arr[0]>arr[1])
        {
          System.out.println(0);
            break;
        }
        else if(arr[n-1]>arr[n-2])
        {
          System.out.println(n-1);
            break;
        }


      }

    }
  }
}
