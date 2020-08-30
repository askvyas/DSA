// Moore's Voting Algorithm for majority elements
class MooreVot
{
  public static int findM(int[] arr,int n)
  {
    int res=0,count=1;
    for (int i=1;i<n;i++) {
      if(arr[res]==arr[i])
      {
        count++;
      }
      else {
        count--;

      }
      if(count==0)
      {
        res=i;
        count=1;
      }

    }
    count=0;
    for (int i=0;i<n;i++) {
      if(arr[res]==arr[i])
      {
        count++;
      }
      if(count<=n/2)
      {
        return -1;
      }


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
    System.out.println(findM(arr,n));

  }
}
