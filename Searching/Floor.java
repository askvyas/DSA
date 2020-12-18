/*We all have learnt about floor of a number in school. Let us try and frame a problem statement around that. So, you are given a number
x
 and a sorted array
A
 containing
N
 distinct integers. Your task is to find floor of
x
 in the array
A
(
0
-based indexing). Now you might be wondering what will be floor of
x
 in
A
? Let me tell you, the floor of x
 will largest element in A that is smaller than or equal to x
.

*/
import java.util.*;
class Floor
{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  while (t-->0) {
    int n=sc.nextInt();
    int x=sc.nextInt();
    int arr[]=new int[n];
    int floor=-1;
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
      if(arr[i]<=x)
      {
        floor=i;
      }

    }
    System.out.println(floor);


  }
}
}
