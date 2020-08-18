//BRIAN KERNINGAM ALGORITHM
//theta(count of set bits in n)
//logic : when 1 is subtracted from a number all the zeroes to after

// first set bit become 1
import  java.util.*;
class  CountSet3
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=0;
    while (n>0) {
      n=(n&(n-1));
      cnt++;

    } 
    System.out.print(cnt);
  }
}
