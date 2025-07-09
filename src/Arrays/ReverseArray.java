package Arrays;
import java.util.*;

public class ReverseArray {
    static void reverseArrApp1(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[n-i-1];
        }
        for(int i=0;i<n;i++) {
            arr[i] = temp[i];
        }
    }

    static void reverseArrApp2(int[] arr){
        int n = arr.length;
        int left=0, right = n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    static void reverseArrApp3(int[] arr){
        int n = arr.length;
        int i=0;
        while(i<n/2){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            i++;
        }
    }

    static void reverseArrApp4(List<Integer> arr){
        Collections.reverse(arr);
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,7};
        reverseArrApp1(arr);
        System.out.println("Reversed (App1 - using temp array):");
        printArray(arr);
        reverseArrApp2(arr);
        System.out.println("Reversed Again (App2 - using 2 pointers):");
        printArray(arr);
        reverseArrApp3(arr);
        System.out.println("Reversed Again (App3 - using 1 pointer):");
        printArray(arr);

        List<Integer> array = new ArrayList<>(Arrays.asList(4,3,2,1,5,7));
        reverseArrApp4(array);
        System.out.println("Reversed Again (App4 - using Collections built in method):");
        System.out.println(array);

    }
}
