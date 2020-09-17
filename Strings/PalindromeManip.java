import java.util.*;
  import java.io.*;

  public class PalindromeManip {
    public static boolean isPal(String s)
    {
      int n=s.length();
      boolean val=false;
      for(int i=0;i<n;i++)
      {
        if(s.charAt(i)==s.charAt(n-i-1))
        {
         val=true;
        }
        else
        {
          val=false;
        }
      }
      return val;
    }

    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
        String s=sc.next();
        int start=0;
        int res=0;
        int n=s.length();

          if(isPal(s))
          {
            res=0;
          }
          else
          {

            for (int i=0;i<n/2;i++) {
              String tmp=new String();

              res+=(int)Math.abs((s.charAt(i)-s.charAt(n-i-1)));


            /*else if(s.charAt(i)<s.charAt(n-i-1))
              {
              res+=(int)(s.charAt(n-i-1)-s.charAt(i));
            }*/

            }
            /*if(s.charAt(start)!=s.charAt(end))
            {
              if(s.charAt(start)<s.charAt(end))
              {
                res+=(int)(s.charAt(end)-s.charAt(start));
              }
              else if(s.charAt(start)>s.charAt(end))
              {
                res+=(int)(s.charAt(start)-s.charAt(end));
              }
            }
            else
            {
              start++;
              end--;
            }*/
          }

        System.out.println(res);

      }

    }
  }
