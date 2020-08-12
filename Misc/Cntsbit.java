import java.util.*;
class Cntsbit{ ///Counting set bits using Simple method 32 bit version i.e using kth bit set or not method
  public static boolean useLeft(int n,int k) //using the left shift operator

  {
    if((n&(1<<(k-1)))!=0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static boolean useRight(int n,int k)
  {
    if(((n>>(k-1))&1)!=0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0)
    {
      int n=sc.nextInt();
      int cnt=0;
      for(int i=0;i<32;i++)
      {
        if(useLeft(n,i)) //use right can also be used
        {
          cnt++;
        }
      }
      System.out.println(cnt);

      t--;

    }

  }
}
