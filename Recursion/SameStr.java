/*PrepBuddy is fascinated with the type of strings that are the same when read from beginning to end and from end to beginning.
Given a string, your task is to help PrepBuddy decide whether the string will fascinate him or not.
*/
import java.util.*;

class SameStr
{
  public static boolean isPal(int a,int b,String s)
  {
    boolean res=false;
    if(a==b)
    {
      if((a==0)&&(b==1))
      {
        return true;
      }
      return res;
    }
    else if(s.charAt(a)==s.charAt(b))
    {
      res=true;
      isPal(a+1,b-1,s);
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    while (t-->0) {
      String s=sc.next();
      if(isPal(0,s.length()-1,s))
      {
        System.out.println("Yes");
      }
      else {
        System.out.println("No");

      }


    }

  }
}
