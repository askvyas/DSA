class Basics
{

  public static void bubbleSort(int[] arr,int n)
  {
    for(int i=n-1;i<n;i--)
    {
      int flag=0;
      for (int j=0;j<i;j++) {
        if(arr[j]>arr[j+1])
        {
          int tmp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=tmp;
          flag=1;
        }

      }
      if(flag==0)
      {
        break;
      }
    }

  }
  public static  void selectionS(int[] arr,int n)
  {
    for (int i=0; i <n-1;i++) {
      int min=i;
      for (int j=i+1;j<n;j++) {
        if(arr[j] < arr[min])
        {
          min=j;
        }

      }
      int tmp=arr[min];
      arr[min]=arr[i];
      arr[i]=tmp;

    }

  }
  public static void insertionS(int[] arr,int n)
  {
    for (int i=1;i<n;i++) {
      int var=arr[i];
      int j=i;
      while (arr[j-1]>var && j>=1) {
        arr[j]=arr[j-1];
        j--;

      }
      arr[i]=var;

    }

  }


  public static void main(String[] args) {
    
    int[] arr={4,8,2,7,9,2};

    int n=arr.length;

    bubbleSort(arr,n);
    for (int i=0;i<n;i++) {
      System.out.print(arr[i]+" ");

    }
    System.out.println();
    int[] arr2={23,10,4,5,11};
    int n2=arr2.length;
    selectionS(arr2,n2);
    for (int i=0;i<n2;i++) {
      System.out.print(arr2[i]+" ");

    }



  }
}
