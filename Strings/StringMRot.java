import java.util.*;
  import java.io.*;

  public class StringMRot {
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
  public static void replace(char[] arr,char[] tmp,int l,int r)
  {
    for(int i=l;i<r;i++)
    {
      for(int j=0;j<tmp.length;j++)
      {
      arr[i]=tmp[j];
      }
    }
  }
    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int t=sc.nextInt();
      String tmp=new String(s);
      System.out.println(tmp);
      while(t-->0)
      {
        char[] ch=tmp.toCharArray();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        char[] ro=Arrays.copyOfRange(ch,l-1,r-1);
        lrotate(ro,ro.length,k);
        replace(ch,ro,l,r);
        tmp=ch.toString();
        System.out.println(tmp);




      }
      System.out.println(tmp);

    }
  }
