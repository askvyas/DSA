/*You are given an array
a
 with
N
 integers and an integer
K
. Output the smallest number in array which occurs exactly
K
 times in an array. There will always be a number that is occurring
K
 times.*/
import java.util.*;
class KNum
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();


    }
    int k=sc.nextInt();
    Arrays.sort(arr);
    int tmp=0;
    int c=1;
    for (int i=tmp+1;i<n;i++) {
      if(arr[tmp]==arr[i])
      {
        c++;
      }
      else {
        c=1;
      }
      if(c==k)
      {
        System.out.println(arr[tmp]);
        break;

      }
      else {
        tmp=i;


      }


    }




  }
}
