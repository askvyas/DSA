import java.util.*;
class Kthbit{
  public static void useLeft(int n,int k) //using the left shift operator

  {
    if((n&(1<<(k-1)))!=0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
  public static void useRight(int n,int k)
  {
    if(((n>>(k-1))&1)!=0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      useRight(n,k);
      t--;

    }

  }
}
