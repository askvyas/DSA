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
    int maxD=1;
    int minVal=0;
    for(int j=1;j<n;j++)
    {
      if(arr[j]>arr[minVal])
      {
      maxD=Math.max(maxD,j-minVal);
      minVal=Math.min(minVal,j);
      cn++;
    }
    }
    if(cn>0)

{    System.out.println(maxD);
  }
  else {
    System.out.println(-1);
  }
}
}
