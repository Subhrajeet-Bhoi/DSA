public class Binary_Search {
    static int  binarySearch(int arr[], int target){
            int left = 0, right = arr.length - 1;

            while(left <= right){
                int mid = left + (right - left);

                if(arr[mid] == target){
                    return mid;
                }else if(arr[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,3,5,9,14,16,18};
        int target = 14;

        int result = binarySearch(arr,target);

        if(result != -1){
            System.out.println("The Element "+target+" Found at Index "+result);
        }else{
            System.out.println("The Element is Not Present in the Array...");
        }

    }
}
