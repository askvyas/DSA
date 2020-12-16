import java.util.*;
class Ex1
{
  public static void prinT(int n)
  {
    if(n<0)
    {
      return ;
    }
    System.out.print(n+" ");
    prinT(n-1);
    
    System.out.print("\n"+n+" ");
  }
  public static void main(String[] args) {
    int a=4;
    prinT(4);

  }
}
