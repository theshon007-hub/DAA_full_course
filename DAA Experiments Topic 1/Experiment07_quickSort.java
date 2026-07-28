import java.util.Arrays;
class Experiment07_quickSort{
    public static int partition(int[] arr,int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<= high && arr[i]<=pivot){
            i++;
        }
        while(j>=low && arr[j]>pivot){
            j--;
        }
        if(i<j){
            swap(arr,i,j);
        }
    }
    swap(arr,j,low);
    return j;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public static void main(String args[]){
        int[] arr = {10, 7, 8, 9, 1, 5};
        quicksort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}