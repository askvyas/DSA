//Given a string sort in in decreasing order and print the string

import java.util.*;
class DecreasingOrder
{
  public static void swap(char a,char b)
  {
    char tmp='a';
    tmp=a;
    a=b;
    b=tmp;
  }
  static String sortO(String s)
  {
  //
    /*char[] ch=s.toCharArray();
    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {
        if(ch[j]>ch[i])
        {
          swap(ch[i],ch[j]);
        }


    }
  }
  return ch.toString();*/
  char[] ch=s.toCharArray();
  Arrays.sort(ch);
    int n=s.length();
char[] res=new char[n];
  for (int i=0;i<n;i++) {
    res[i]=ch[n-i-1];

  }
  return new String(res);
}

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {
      String s=sc.next();
      String res=sortO(s);
      System.out.println(res);


    }
  }
}
