public class InPlaceSorts {
    public static void bubbleSort(String[] list1)
    {
        int swaps=1;
        while(swaps !=0)
        {
            for(int i=0;i<list1.length;i++)
            {
                if (list1[i].compareTo(list1[i+1])>0)
                {
                    String first=list1[i];
                    String second=list1[i+1];
                    list1[i]=second;
                    list1[i+1]=first;
                }
                swaps++;
            }
        }
    }

    public void merge(int[] arr,int left,int mid,int right,int[] temp)
    {
        int i=left;
        int j=mid+1;
        int k=left;

        while(i<=mid &&j<=right)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
            }
            else{
                temp[k]=temp[j];
            }
            k++;
        }
        while(i<= mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        for (int x=i;i<j;x++)
        {
            arr[x]=temp[x];
        }
    }

    public void selectionSort(x)
}

