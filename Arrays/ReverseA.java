//My method of Array Reversal without using an extra loop
//other than using the same input for loop


import java.util.*;
class ReverseA
{
  public static void reverse(int[] arr)
  {

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] rev=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
      rev[n-i-1]=arr[i];


    }
  for (int i=0;i<n;i++) {
    System.out.println(rev[i]);

  }


  }
}
