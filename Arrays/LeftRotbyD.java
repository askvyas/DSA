//Left Rotate array by d places
import java.util.*;

class LeftRotbyD
{
  //Naive solution using left Rotate by one D times
  public static void leftRotOne(int[] arr,int n)
  {
    int tmp=arr[0];
    for (int i=1;i<n;i++) {
      arr[i-1]=arr[i];

    }
    arr[n-1]=tmp;
  }
  public static void leftRot(int[] arr,int n,int d)
  {
    for (int i=0;i<d;i++) {
      leftRotOne(arr,n);

    }
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    leftRot(arr,n,d);
    for (int i=0;i<n;i++) {
      System.out.println(arr[i]+" ");

    }

  }
}
