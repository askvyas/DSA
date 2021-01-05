/*This is IntrAr using maps*/
import java.util.*;
class IntrM
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    int[] arr=new int[n];
    
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
      map.put(i+1,arr[i]-k);


    }


    int res=0;
    for (int i=0;i<n;i++) {
      if(map.containsValue(arr[i]))
      {
        res++;

      }

    }
    System.out.println(res);



  }
}
