//Bubble Sort
import java.util.Scanner;
public class Index{
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the Array Elements :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        //Bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                } 
            }
        }
        display(arr);
    }
}