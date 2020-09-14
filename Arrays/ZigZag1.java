//Logic not understood need help

import java.util.*;
class ZigZag1
{
public static  int solve(int nums[], int n,int start) {
        int res = 0;
        for (int i=start; i<n; i+=2) {
            int to = nums[i];
                // make sure current element is less than its left neighboor
                if(i!=0)
                {
                to = Math.min(to, nums[i-1]-1);
              }
            if (i+1 != n) {
                // make sure current element is less than its right neighboor
                to = Math.min(to, nums[i+1]-1);
            }
            // if curr value was decreased to "to", add the difference
            res += nums[i] - to;
        }
        return res;
    }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    int r1=solve(arr,n,1);
    int r2=solve(arr,n,0);
        System.out.println(Math.min(r1,r2));
        System.out.println(r2);
        System.out.println(r1);




  }
}
