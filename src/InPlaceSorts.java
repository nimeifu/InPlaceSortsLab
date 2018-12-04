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

    public int partition(int[] arr,int left,int right)
    {
        int pivot=arr[right];
        int i=arr[left-1];
        for(int j=left;j<right;j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;
    }
    public void quickSort(int[] arr,int left,int right) {

        if (left < right) {
            int pivot =partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }


    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length-1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }






}
