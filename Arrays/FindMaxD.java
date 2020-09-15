import  java.util.*;
class FindMaxD
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    int res=0;
    int cn=0;
    for (int i=0;i<n;i++) {
      for (int j=i+1;j<n;j++) {
        if(arr[j]>arr[i])
        {
          int tmp=j-i;
          res=Math.max(res,tmp);
          cn++;
        }

      }

    }
    if(cn>0)

{    System.out.println(res);
  }
  else {
    System.out.println(-1);
  }
}
}
