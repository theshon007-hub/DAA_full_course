import java.io.*;
import java.util.*;
import java.util.Arrays;
class Experiment06_MergeSort{
    public static void merge(int[] arr,int start,int mid,int end){
        int len = arr.length;
        int[] mergearr = new int[len];
        int i = start, j = mid, k = start;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mergearr[k] = arr[i];
                i++;
                k++;
            }
            else{
                mergearr[k] = arr[j];
                j++;
                k++;
            }

        }
        while(i<mid){
            mergearr[k] = arr[i];
            k++;
            i++;
        }
        while(j<end){
            mergearr[k] = arr[j];
            j++;
            k++;
        }
        for(int x = start; x<end;x++){
            arr[x] = mergearr[x];
        }
    }
    public static void mergeSort(int[] arr,int start,int end){
        if(end-start == 1)
            return;
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void main(String args[]){
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }
}