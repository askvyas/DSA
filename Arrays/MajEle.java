//Find the majority elemnt in a given Array
//elemnt that appears more than n/2 times in an array//
 //is called the majority element we o/p the index of majority elemnt
import  java.util.*;
class MajEle
{
  // Naive Solution
  public static int findM(int[] arr,int n)
  {
    for (int i=0;i<n;i++) {
      int cnt=1;
      for (int j=i+1;j<n;j++) {
        cnt++;

      }
      if(cnt>n/2)
      {
        return i;
      }

    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    System.out.println(findM(arr,n));


  }

}
