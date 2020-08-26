//Given a sorted array find the freequencies of Repeating Elements
import java.util.*;
class FreeQ
{
  public static void getCnt(int[] arr,int n)
  {
    int freq=1;
    int i=1;
    while (i<arr.length) {
      while ((i<arr.length)&&(arr[i]==arr[i-1])) {
        freq++;
        i++;


      }
      System.out.println(arr[i-1]+" -  "+freq);
      freq=1;
      i++;

    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    getCnt(arr,n);


  }
}
