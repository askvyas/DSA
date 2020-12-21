import java.util.*;
class Maxi
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int k=sc.nextInt();
    for (int i=0;i<n;i++) {
      arr[i]=i+1;


    }
    int max=0;
    int c=0;
    for (int i=0;i<n;i++) {
      max+=(arr[i]*5);
      if(max<=(240-k))
      {
        c++;

      }

    }
    System.out.println(c);

  }
}
