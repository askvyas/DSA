import java.util.*;
class PlayingCards
{
  public static boolean canPlay(String s,String p)
  {
    String[] str=p.split(" ");
    for (int i=0;i<str.length;i++) {
      if((str[i].charAt(0)==s.charAt(0))||str[i].charAt(1)==s.charAt(1))
      {
        return true;
      }

    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();

    while (t-->0) {
      String tab=sc.nextLine();

      String player="";
      player+=sc.nextLine();
      sc.close();


      if(canPlay(tab,player))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }


    }
  }
}
