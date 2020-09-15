/*Aditya and Danish are great chess players and they want to know who is the better player. So they play
N
N
 games in a row. For each game, we noted down the winner- Aditya or Danish. There was no tie.
Now they are tired of playing the game and want you to find out who won more games.
/*
6
6

ADAAAA
Aditya
*/
import java.util.*;
  import java.io.*;

  public class AdDan {
    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
       int n=sc.nextInt();
      String s=sc.next();
      int a=0;
      int b=0;
      for(int i=0;i<n;i++)
      {
        if(s.charAt(i)=='A')
        {
          a++;
        }
        else if(s.charAt(i)=='D')
        {
          b++;
        }
      }
      if(a>b)
      {
        System.out.println("Aditya");
      }
      else if(b>a)
      {
        System.out.println("Danish");
      }
      else
      {
        System.out.println("AdiDan");
      }
      }

    }
  }
