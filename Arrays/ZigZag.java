/*You are given an array of
N integers. You have to make the given array into a zigzag array. During
converting given array into a zigzag array you can perform a move, which consists of choosing any element and decreasing it by
An array is a zigzag array if either:
1. Every even-indexed element is greater than adjacent elements, ie. A0 > A1 < A2 > A3 < A4 > ...
2. OR, every odd-indexed element is greater than adjacent elements, ie. A0 < A1 > A2 < A3 > A4 < ...
Print the minimum number of moves to transform the given array into a zigzag array.*/
import java.util.*;
class ZigZag{
public static  boolean isEZig(int[] arr,int n,int i)
  {
    boolean val=false;

      if(i==0)
      {
        if(arr[i]>arr[i+1])
        {
          val=true;

        }

      }
      else if(i==n-1)
      {
        if(arr[i]>arr[i-1])
        {
          val=true;

        }



      }
      else {
        if((arr[i]>arr[i+1])&&(arr[i]>arr[i-1]))
        {
          val=true;

        }


      }
      return val;




  }
  public static  boolean isOZig(int[] arr,int n,int i)
    {
      boolean val=false;

        if(i==1)
        {
          if((arr[i]>arr[i+1])&&(arr[i-1]<arr[i]))
          {
            val=true;

          }

        }
        else if(i==n-1)
        {
          if(arr[i]>arr[i-1])
          {
            val=true;

          }
        }
        else {
          if((arr[i]>arr[i+1])&&(arr[i]>arr[i-1]))
          {
            val=true;

          }
        }
        return val;
      }
   public static int cntE(int[] arr,int n )
  {
    int s=0;
    for (int i=0;i<n;i=i+2) {
      if(isEZig(arr,n,i))
      {
        s+=0;

      }
      else {
        while(true)
        {
          if(i==0)
          {

          if(arr[i]<=arr[i+1])
          {  arr[i+1]--;
            s++;
          }
          else {
            break;
          }


          }
          else if(i==n-1)
          {

          if(arr[i-1]>=arr[i])
          {  arr[i-1]--;
            s++;
          }
          else {
            break;

          }
        }
          else {
            if((arr[i]<=arr[i+1])||(arr[i]<=arr[i-1]))
            {
              if(arr[i]<=arr[i+1])
              {
                arr[i+1]--;
                s++;
              }

               if(arr[i]<=arr[i-1])
              {
                arr[i-1]--;
                s++;
              }
              if(isEZig(arr,n,i))
              {
                break;

              }



            }
          }

        }
      }

    }
    return s;

  }
  public static int cntO(int[] arr,int n )
  {
    int s=0;
    for (int i=1;i<n-1;i=i+2) {
      if(isOZig(arr,n,i))
      {
        s+=0;

      }
      else {
        while(true)
        {
          if(i==1)
          {

          if(arr[i]<=arr[i+1])
          {  arr[i+1]--;
            s++;
          }
          else  if(arr[i]<=arr[i-1])
            {  arr[i-1]--;
              s++;
            }
          else {
            break;
          }




          }

          else if(arr[i]==n-1)
          {
            if(arr[i]<arr[i-1])
            {
              arr[i-1]--;
              s++;
            }
            else {
              break;

            }
          }
          else {
            if((arr[i]<=arr[i+1])||(arr[i]<=arr[i-1]))
            {
              if(arr[i]<=arr[i+1])
              {
                arr[i+1]--;
                s++;
              }

               if(arr[i]<=arr[i-1])
              {
                arr[i-1]--;
                s++;
              }
              if(isOZig(arr,n,i))
              {
                break;
              }
            }

          }
        }
        }
      }
  return s;
}
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    if(n==2)
    {
      if(arr[0]==arr[1])
      {
        System.out.print(1);
      }
      else {
        int te=0;
        int to=0;
        if(arr[0]>arr[1])
        {


        }



      }
    }
    else {

      int ro=cntO(arr,n);
      int re=cntE(arr,n);
      System.out.println(ro);
      System.out.println(re);
      System.out.println(Math.min(ro,re));

    }



  }

}
