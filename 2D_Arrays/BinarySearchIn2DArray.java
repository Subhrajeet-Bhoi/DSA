import java.util.*;
public class BinarySearchIn2DArray {
    static int[] search(int matrix[][], int target){

        int row = 0, col = matrix.length-1;

        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }else if(matrix[row][col] < target){
                row++; 
            }else{
                col--;
            }
        } 
        return new int[]{-1,-1}; 
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int target = 5;

        System.out.println(Arrays.toString(search(arr,target)));
    }
} 