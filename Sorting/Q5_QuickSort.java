public class Q5_QuickSort{

    static void quickSort(int arr[], int low,int high){
        if(low <= high){

            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static int partition(int arr[], int low , int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low;j<high;j++){
            if(pivot > arr[j]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args){

        int arr[ ] = {7,8,3,1,2};
        int  n = arr.length - 1;

        quickSort(arr,0,n);

        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}