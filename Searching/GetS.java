import java.util.*;
class GetS
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
      int res=0;
      int lmax=arr[0];
      for (int i=0;i<n;i++) {
        if(arr[i]>=lmax)
        {
          res++;
          lmax=arr[i];

        }


      }
      System.out.println(res);



    }
  }
}
