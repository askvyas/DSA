import java.util.*;
import java.lang.Math;
class MaxSubUnq
{
  public static boolean isUnq(String s)
  {
    boolean val=true;
    int n=s.length();
    int[] cnt=new int[26];
    for (int i=0;i<n;i++) {
      cnt[s.charAt(i)-'a']++;


    }
    for (int i=0;i<26;i++) {
      if(cnt[i]>1)
      {
        return false;
      }

    }
    return val;
  }
  static int getpower(String s)
  {
    int k=s.length();
    int max=0;
    double powsize=Math.pow(2,k);
    for (int cnt=0;cnt<powsize;cnt++) {
      String st="";
      for (int i=0;i<k;i++) {
        if((cnt&(1<<i))!=0)
        {
          st+=s.charAt(i);
        }

      }
      if(isUnq(st))
      {
        max=Math.max(max,st.length()-1);
      }



    }
    return max;


  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();

  System.out.println(getpower(s));


  }
}
