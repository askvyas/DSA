import  java.util.*;

class PowT
{
  public static int count(int n ) //power of 2 using No of set bits
  {
    int cnt=0;
    while (n>0) {
      n=(n&(n-1));
      cnt++;

    }
    return cnt;

  }
  public static boolean set(int n) //Most efficient method
  {
    if(n==0)
    {
      return false;
    }
    return ((n&(n-1))==0);

    //single line expressionn is
   //return (n!=0)&&((n&(n-1))==0);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //Method 1
    /*int res=count(n);
    if(res==1)
    {
      System.out.print("Power of 2");
    }
    else {
      System.out.print("Not a power");
    }*/
    if(set(n))
    {
      System.out.println("Yes");
    }
    else {
      System.out.println("Not a power");
    }
  }
}
