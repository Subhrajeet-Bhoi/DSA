public class Floor_Number {

     static int  Floor_Number(int arr[], int target){
            int left = 0, right = arr.length - 1;

            if(target > arr[right]){
                return -1;
            }

            while(left <= right){
                int mid = left + (right - left);

                if(arr[mid] == target){
                    return target;
                }else if(arr[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            return arr[right];
    }
    public static void main(String[] args){
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println("floor of the Number is : "+Floor_Number(arr, target));
    }
}