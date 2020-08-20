//Check if an array is sorted or not

import java.util.*;


class IsSort
{
  public static boolean isSort(int[] a)
  {
    int[] b=a.clone();
    Arrays.sort(a);
    return Arrays.equals(a, b);


  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    if(isSort(arr))
    {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }

  }
}
