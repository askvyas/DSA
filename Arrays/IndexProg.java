import java.util.*;
  import java.io.*;

  public class IndexProg {


    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int[] f1=new int[n];
      boolean[] f2=new boolean[n];
      int f3[]= new int[n];
      for (int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++)
        {
          if(arr[i]==arr[j])
          {
            f1[i]=j-i;


          }
          if(f1[j]==f3[i])
          {
            f2[i]=true;
          }
          f3[i]=f1[j];



        }



      }
      for (int i=0;i<n;i++) {
        if(f2[i])
        {
          System.out.println(arr[i]+" "+f1[i]);
        }

      }



      }


    }
