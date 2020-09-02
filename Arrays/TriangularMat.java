import java.util.*;
class TriangularMat
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[][] arr=new int[m][n];
    int[][] arr1=new int[m][n];
    int[][] arr2=new int[m][n];

    for (int i=0;i<m;i++) {
      for (int j=0;j<n;j++) {
        arr[i][j]=sc.nextInt();

      }
    }
    for (int i=0;i<m;i++) {
      for (int j=0;j<n;j++) {
        if(j>i)
        {
          arr1[i][j]=0;
        }
        else {
          arr1[i][j]=arr[i][j];
        }

      }
    }
    for (int i=0;i<m;i++) {
      for (int j=0;j<n;j++) {
        if(j<i)
        {
          arr2[i][j]=0;
        }
        else {
          arr2[i][j]=arr[i][j];
        }

      }
    }
    for (int i=0;i<m;i++) {
      for (int j=0;j<n;j++) {
        System.out.print(arr1[i][j]+" ");

      }
      System.out.println();
    }
    for (int i=0;i<m;i++) {
      for (int j=0;j<n;j++) {
        System.out.print(arr2[i][j]+" ");

      }
      System.out.println();
    }


  }
}
