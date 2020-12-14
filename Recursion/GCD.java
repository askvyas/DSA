import java.util.*;

class GCD
{
  public static int gcd(int a,int b)
  {
int res=0;
    if((a!=0)&&(b!=0)) {
      if(a>b)
      {
        res=gcd(a-b,a);
      }
      else {
        res=gcd(a,b-a);
      }
    }
    else
    {
      if(a==0)
      {
        res=b;
      }
      else {
        res=a;
      }
    }
    return res;

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(gcd(a,b));

    }


  }
}
