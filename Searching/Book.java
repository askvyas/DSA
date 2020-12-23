/*Bob has recently got his new collection of novels. He arranges all the books on a shelf. Because of his crazy rules, he only reads a book from one of the ends of the shelf. Thus, each book Bob reads is either leftmost or rightmost book from the shelf. Bob cannot read a book if it has more than
K
 chapters, again a crazy rule. When Bob has read a book, he removes it from the shelf. Bob stops when he is unable to read any book from any end of the shelf. How many books are still present on the shelf?
*/
import java.util.*;
class Book
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    int a=0;
    int b=0;
    for (int i=0;i<n;i++) {
      if(arr[i]<k)
      {
        a++;
      }
      else {
        break;
      }

    }
    for (int i=n-1;i>=0;i--) {
      if(arr[i]<k)
      {
        b++;
      }
      else {
        break;
      }

    }
    System.out.println(arr.length-Math.max(a,b));

  }
}
