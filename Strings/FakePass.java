import java.util.*;
class FakePass
{
  public static void reverse(char[] arr,int start,int end)

  {
    int n=arr.length;
    while (start<end) {
      char tmp=arr[start];
      arr[start]=arr[end];
      arr[end]=tmp;
      start++;
      end--;

    }

  }
  public static void rrotate(char[] ch,int n,int d)
  {
    reverse(ch,0,n-1);
    reverse(ch,0,d-1);
    reverse(ch,d,n-1);

  }
  public static void lrotate(char[] ch,int n,int d)
  {
    reverse(ch,0,d-1);
    reverse(ch,d,n-1);
    reverse(ch,0,n-1);

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      String orig=sc.next();
      String fake=sc.next();
      char[] tm=fake.toCharArray();
      char[] tml=fake.toCharArray();


      rrotate(tm,tm.length,2);
      lrotate(tml,tml.length,2);

      String res=new String(tm);
      String resq=new String(tml);

      if(res.equals(orig)||resq.equals(orig))
      {
        System.out.println("Yes");
      }
      else {
        System.out.println("No");
      }



    }
  }
}
