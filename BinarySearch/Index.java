import java.util.Scanner;
public class Index{
    static int floorOfNumber(int arr[], int target){
        int start =  0, end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target :");
        int target = sc.nextInt();
        sc.close();

        int result = floorOfNumber(arr,target);

            if(result != -1){
                System.out.println("floor of Number is : "+result);
            }else{
                System.out.println("The Element is not present in the Array :");
            }
    }
}