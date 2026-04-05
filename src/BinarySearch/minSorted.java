package BinarySearch;

public class minSorted {
    public static int findMinInSortedArray(int[] arr){
        int low = 0;
        int n = arr.length;
        int high = n - 1;

        if(arr[high] >= arr[low]) return arr[low];

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > arr[low]){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("Min elem is: " + findMinInSortedArray(arr));
    }
}
