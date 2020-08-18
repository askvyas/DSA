//Program to Generate Power Set of a String using Bitwise operators
import java.util.*;
import java.lang.Math;
class PoweSet
{
  static void getpower(String s)
  {
    int k=s.length();
    double powsize=Math.pow(2,k);
    for (int cnt=0;cnt<powsize;cnt++) {
      for (int i=0;i<k;i++) {
        if((cnt&(1<<i))!=0)
        {
          System.out.print(s.charAt(i));
        }

      }
      System.out.println();

    }


  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();

    getpower(s);


  }
}
