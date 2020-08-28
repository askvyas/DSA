//Circular subarray
//ex {10,5,-5}
//All normal subarrays + {5,-5,10} , {-5,10} ,{-5,10,5}
class MaxCircSum
{
  //Naive Solution
  public static int maxSum(int[] arr)
  {
    int n=arr.length;
    int res=arr[0];
    for (int i=0;i<n;i++) {
      int c_sum=arr[i];
      int m_sum=arr[i];
      for (int j=1;j<n;j++) {
        int idx=(i+j)%n;
        c_sum=+arr[j];
        m_sum=Math.max(m_sum,c_sum);

      }
      res=Math.max(res,m_sum);

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
    System.out.println(maxSum(arr));


  }

}
