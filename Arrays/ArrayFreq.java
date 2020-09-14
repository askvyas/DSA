//Construct a 3d Array of elements and their freequencires
import java.util.*;
class ArrayFreq
{

public static void countFreq(int arr[], int n)
{
    boolean visited[] = new boolean[n];

    Arrays.fill(visited, false);

    // Traverse through array elements and
    // count frequencies
    for (int i = 0; i < n; i++) {

        // Skip this element if already processed
        if (visited[i] == true)
            continue;

        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " " + count);
    }
}

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[][] fre=new int[n][2];
    for (int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }

    int[][] freq=new int[n][2];
    boolean visited[] = new boolean[n];

    Arrays.fill(visited, false);

    for (int i = 0; i < n; i++) {

        if (visited[i] == true)
            continue;

        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        freq[i][0]=arr[i];
        freq[i][1]=count;


  }
  for (int i=0;i<n;i++) {
    for (int j=0;j<2;j++) {
      System.out.print(freq[i][j]+" ");

    }
    System.out.println();

  }
}
}
