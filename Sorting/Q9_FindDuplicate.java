//Leetcode - 287 : Find duplicate Element
public class Q9_FindDuplicate{

    static int duplicateElement(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        return arr[arr.length-1];
    }

    static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args){

        int arr[] = {3,1,3,4,2};

        System.out.println(duplicateElement(arr));


    }
}