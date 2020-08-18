//theta(no of bits in n)   

import java.util.*;
class CountSet2

{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=0;
    while (n>0) {
      //commented is using normal math operator
    //  if(n%2!=0)
      //{
      //  cnt++;

      //}
      //n=n/2;
      cnt=cnt+(n&1);
      n=n>>1;
    }
    System.out.print(cnt);
  }
}
