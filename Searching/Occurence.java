/*Let's start practicing searching with a simple problem statement. You are given an unsorted array of characters
A
 and a character x. You have to find the number of times x occurs in character array
*/

import java.util.*;
class Occurence
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while (t-->0) {

      int r=0;
      int s=sc.nextInt();
      char[] arr=new char[s];
      for (int i=0;i<s;i++) {
        arr[i]=sc.next().charAt(0);
        if(arr[i]=='x')
        {
          r++;
        }


      }
      System.out.println(r);

    }

  }

}
