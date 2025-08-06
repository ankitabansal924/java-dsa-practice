package Arrays;

import java.util.LinkedHashMap;
import java.util.*;

public class RemoveDuplicates {
    public static int removeDupUsingSet(int[] arr){
        Set<Integer> st = new LinkedHashSet<>();
        for(int num : arr){
            st.add(num);
        }
        int i = 0;
        for(int num : st){
            arr[i++] = num;
        }
        return i;
    }

    public static int removeDup(int[] arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void printArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n1 = removeDupUsingSet(arr1);
        printArray(arr1, n1);

        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        int n2 = removeDupUsingSet(arr2);
        printArray(arr2, n2);
    }
}
