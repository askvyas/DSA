import java.util.*;
class DuplicateCh


{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String s=sc.next();
      int n=s.length();
      int[] arr=new int[26];
      int k=-1;
      for (int i=0;i<n;i++) {
        arr[s.charAt(i)-'a']++;

      }
      for (int i=0;i<26;i++) {
        if((arr[i]!=0)&&(arr[i]>1))
        {
        System.out.print((char)(i+'a')+"="+arr[i]+" ");
        k++;
        }
        }
      if(k<0)
      {
        System.out.println(k);
      }
    }
  }
}
