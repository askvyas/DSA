import java.util.*;
class FriendsAge
{
  public static boolean satis(int a,int b)
  {
    boolean ra=(b<=((0.5*a)+7));
    boolean rb=(b>100)&&(a<70);
    boolean rc=(b>a);
    return (ra||rb)||rc;

  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int res=0;
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    int[] arc=new int[120];
    for (int i=0;i<n;i++) {
    arc[arr[i]-1]++;
  }



    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {

        if((j!=i)&&(!(satis(arr[i],arr[j]))))
        {
          if(arr[i]==arr[j])
          {

            if(n==arc[arr[i]-1])
            {
              res=(arc[arr[i]-1]*(arc[arr[j]-1]-1));

              break;

          }
          else {
            res+=(arc[arr[i]-1]*(arc[arr[j]-1]-1));
          }
          }

          else
          {


            res+=(arc[arr[i]-1]*(arc[arr[j]-1]));


          }
        }
        else {
          continue;
        }



      }

    }
    System.out.println(res);

  }
}
