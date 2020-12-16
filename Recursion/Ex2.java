import java.util.*;
  import java.io.*;

  public class Ex2 {
    public static void getP(int n)
    {

      System.out.print(n+" ");
      if(n<=0)
      {
        return;
      }

        getP(n-5);
        System.out.print(n+" ");

    }
    public static void main(String args[]) throws IOException {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      getP(n);


    }
  }
