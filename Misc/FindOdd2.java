//Two odd occuring
import java.util.*;
class FindOdd2
{
  //naive O(n^2 ) solution

 /*static void findodd(int[] arr,int n)
 {
   for (int i=0;i<n;i++) {
     int count=0;
     for (int j=0;j<n;j++) {
       if(arr[i]==arr[j])
       {
         count++;
       }

     }
     if(count%2!=0)
     {
       System.out.println(arr[i]+" ");
     }

   }

 }*/
 static void findodd(int[] a,int n)
 {
   int xor=0,res1=0,res2=0;
   for (int i=0;i<n;i++) {
     xor=(xor^a[i]);

   }
    int rmb=(xor&(~(xor-1)));
    for (int i=0;i<n;i++) {
      if((a[i]&rmb)!=0)
      {
        res1=(res1^a[i]);
      }
      else {
        res2=(res2^a[i]);
      }
    }
    System.out.println(res1+" "+res2);
 }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    findodd(arr,n);
  }
}
