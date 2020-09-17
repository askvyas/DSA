import java.util.*;
  import java.io.*;

  public class EqualStrings {
    public static String append(String s)
    {
      String  res=new String();
      int n=s.length();
      for(int i=1;i<n;i++)
      {
        res+=s.charAt(i);
      }
      res+=s.charAt(0);
      return res;
    }
    public static boolean isEqual(String[] s)
    {
      int n=s.length;
      boolean val=false;
      for (int i=1;i<n;i++) {
        if(s[0].equals(s[i]))
        {
          val=  true;
        }
        else {
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
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
              arr[i]=sc.next();

        }
        int cnt=0;
        for (int i=0;i<n;i++) {
          if(isEqual(arr))
          {
            break;

          }
          else {
            append(arr[i]);
            cnt++;


          }

        }
        if(cnt>0)
        {
        System.out.println(cnt);
      }
      else {
        System.out.println(-1);
      }
      }

    }
  }
