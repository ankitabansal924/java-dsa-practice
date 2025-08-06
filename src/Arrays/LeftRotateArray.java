package Arrays;

import java.util.Scanner;

public class LeftRotateArray {
    public static void leftRotate1place(int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void leftRotateKplaces(int[] arr, int k){
        int n = arr.length;
        k %= n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        leftRotate1place(arr1);
        printArray(arr1);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Enter value of k: ");
        int k = sc.nextInt();
        leftRotateKplaces(arr2, k);
        printArray(arr2);
    }
}
