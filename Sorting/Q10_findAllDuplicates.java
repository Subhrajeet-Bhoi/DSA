import java.util.*;

public class Q10_findAllDuplicates {

    static ArrayList<Integer> findDuplicate(int arr[]) {

        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < arr.length) {

            if (arr[i] != i + 1) {

                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++; // duplicate found, move ahead
                }

            } else {
                i++; // ✅ THIS WAS MISSING
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(arr[index]); // better to add duplicate value
            }
        }

        return list;
    }

    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};

        ArrayList<Integer> myList = findDuplicate(arr);

        System.out.println(myList); // [2, 3]
    }
}
