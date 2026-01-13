public class Q7_MissingNumber {

    static int findMissingNumber(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct  = arr[i] ;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    
    static void swap(int arr[], int start , int end){
        int temp  = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};

        System.out.println(findMissingNumber(arr));

    }
}