import java.util.Scanner;

public class binarySearching {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\nInput 1 number :");
        int inputNum = scn.nextInt();
        int index = binarySearch(arr,0,arr.length-1,inputNum);
        if (index == -1) {
            System.out.println("Cant find that number");
        } else {
            System.out.printf("%d in position %d", inputNum, index);
        }
    }

    static int binarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid - 1, value);
            return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }
}
