import java.util.*;
public class BblSort {

    public static void bubbleSort(int[] arr,int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<5;i++)
        {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr, 5);
        for(int i=0;i<5;i++)
        {

            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
