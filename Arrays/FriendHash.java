import java.util.*;
class FriendHash
{
  public static boolean satis(int a,int b)
  {
    boolean ra=(b<=((0.5*a)+7));
    boolean rb=(b>100)&&(a<70);
    boolean rc=(b>a);
    return (ra||rb)||rc;

  }
  static int getCount(int[] arr,int n)
  {
    int res=0;
    Map<Integer,Integer> mp=new HashMap();
    for (int i=0;i<n;i++) {
      if(mp.containsKey(arr[i]))
      {
        mp.put(arr[i],mp.get(arr[i])+1);
      }
      else {
        mp.put(arr[i],1);
      }

    }
    Integer[] key = mp.keySet().toArray(new Integer[0]);
    Integer[] values = mp.values().toArray(new Integer[0]);

    for (int i=0;i<key.length;i++) {
      for (int j=0;j<key.length;j++) {
        if(!(satis(key[i],key[j])))
        {
          if(key[i]==key[j])
          {
            res+=((values[i])*(values[i]-1));


          }
          else {
            res+=((values[i])*(values[j]));
          }

        }

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
    System.out.println(getCount(arr,n));
  }
}
