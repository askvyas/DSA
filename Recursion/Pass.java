/*Arnab was given a task to a crack password(maximum length of password is
4
4
). Given a length
l
l
, Arnab wants to try all password of length
l
l
.
Help him to find all possible passwords of length
l
l
 using recursion.
Digits of the password are from
*/
import java.util.*;
class Pass
{
  public static boolean noZ(int a)
  {
    String s=String.valueOf(a);
    if(s.contains("0"))
    {
      return false;
    }
    return true;
  }
  public static void getP(int b,int c)
  {
    if(noZ(b))
    {
    System.out.println(b);
  }
    if(b<c)
    {
      b++;
      getP(b,c);
    }


  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      int a=sc.nextInt();
      int b=(int)Math.pow(10,a-1);
      int c=(int)Math.pow(10,a)-1;
      getP(b,c);



    }
  }
}
