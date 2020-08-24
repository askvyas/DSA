import java.util.*;

class LeadersArr2
{
  public static void isLead(int[] arr,int n)
  {
    for (int i=0;i<n;i++) {
      boolean flag=false;
      for (int j=i+1;j<n;j++) {
        if(arr[i]<=arr[j])
        {
          flag=true;
          break;
        }


      }
      if(!flag)
      {
        System.out.println(arr[i]);
      }

    }

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    isLead(arr,n);

  }
}
