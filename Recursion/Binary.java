/*Arnab is given a number
n
n
.
You have to help Arnab print all the binary numbers of length
n
n
 with no consecutive
1
1
 in lexiographical order.
*/
import java.util.*;
class Binary
{
 public static void binary(int[] arr,int n,int k)
 {
   //String s = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");

   //System.out.print(s);
   if(k==n)
   {
     String s = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");

     System.out.println(s);
     return ;
   }
   if(arr[k-1]==0)
   {
     arr[k]=0;
     binary(arr,n,k+1);
     arr[k]=1;
     binary(arr,n,k+1);


   }
   else {
     arr[k]=0;
     binary(arr,n,k+1);

   }
 }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t =sc.nextInt();
    while (t-->0) {
      int n=sc.nextInt();
      int[] arr=new int[n];
      arr[0]=0;

      binary(arr,n,1);
      arr[0]=1;
      binary(arr,n,1);


    }


  }
}
