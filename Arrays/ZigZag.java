/*You are given an array of
N integers. You have to make the given array into a zigzag array. During
converting given array into a zigzag array you can perform a move, which consists of choosing any element and decreasing it by
1

An array is a zigzag array if either:
1. Every even-indexed element is greater than adjacent elements, ie. A0 > A1 < A2 > A3 < A4 > ...
2. OR, every odd-indexed element is greater than adjacent elements, ie. A0 < A1 > A2 < A3 > A4 < ...
Print the minimum number of moves to transform the given array into a zigzag array.*/
import java.util.*;

class ZigZag{
  public static  int isEZig(int[] arr,int n)
  {
    boolean val=false;
    int s=0;
    for (int i=0;i<n;i=i+2) {
      if(i==0)
      {
        if(arr[i]>arr[i+1])
        {
          val=true;

        }
        else {
          while (arr[i]>arr[i+1]) {
            arr[i+1]--;
            s++;
            if(arr[i]>arr[i+1])
            {
              break;

            }

          }

        }
      }
      else if(i==n-1)
      {
        if(arr[i]>arr[i-1])
        {
          val=true;

        }
        else {
          while (arr[i]>arr[i-1]) {
            arr[i-1]--;
            s++;

          
          }

        }
      }
      else {
        if((arr[i]>arr[i+1])&&(arr[i]>arr[i+1]))
        {
          val=true;

        }
        else {
          while ((arr[i]>arr[i+1])&&(arr[i]>arr[i+1])) {
            if(arr[i]<arr[i+1])
            {
              arr[i+1]--;
                s++;

            }
            if(arr[i]<arr[i+1])
            {
              arr[i-1]--;
              s++;
            }


          }

        }

      }

    }
    return s;

  }
  public static  int isOZig(int[] arr,int n)
  {
    boolean val=false;
    int s=0;
    for (int i=1;i<n;i=i+2) {
      if(i==0)
      {
        if(arr[i]>arr[i+1])
        {
          val=true;

        }
        else {
          while (true) {
            arr[i+1]--;
            s++;
            if(arr[i]>arr[i+1])
            {
              break;

            }

          }

        }
      }
      else if(i==n-1)
      {
        if(arr[i]>arr[i-1])
        {
          val=true;

        }
        else {
          while (true) {
            arr[i-1]--;
            s++;
            if(arr[i]>arr[i-1])
            {
              break;

            }

          }

        }
      }
      else {
        if((arr[i]>arr[i+1])&&(arr[i]>arr[i+1]))
        {
          val=true;

        }
        else {
          while (true) {
            if(arr[i]<arr[i+1])
            {
              arr[i+1]--;
                s++;

            }
            if(arr[i]<arr[i+1])
            {
              arr[i-1]--;
              s++;
            }


            if((arr[i]>arr[i+1])&&(arr[i]>arr[i+1]))
            {
              break;

            }

          }

        }

      }

    }
    return s;
  }
  /*public static int cntE(int arr[],int n)
  {
    int cnt=0;
    for (int i=0;i<n;i++) {
      if(i==0)
      {
        if(arr[i]<arr[i+1])
        {


        }
      }


    }
  }*/
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    //int res=Math.min(isEZig(arr,n),isOZig(arr,n));
    System.out.println(isEZig(arr,n));

  }

}
