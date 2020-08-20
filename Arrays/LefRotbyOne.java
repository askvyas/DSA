//Left Rotate an array by one position

import  java.util.*;
class LefRotbyOne
{
  public static void leftRot(int[] arr,int n)
  {
    int tmp=arr[0];
    for (int i=1;i<n;i++) {
      arr[i-1]=arr[i];

    }
    arr[n-1]=tmp;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    leftRot(arr,n);
    System.out.println();

    for (int i=0;i<n;i++) {
      System.out.print(arr[i]+" ");

    }


  }

}
