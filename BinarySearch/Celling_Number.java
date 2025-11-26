public class Celling_Number {
  static int  cellingOfNumber(int arr[], int target){
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
            return arr[left];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;

        System.out.println("Celling of the Number is : " + cellingOfNumber(arr, target));

    }
}
