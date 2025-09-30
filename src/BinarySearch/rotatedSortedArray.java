package BinarySearch;

public class rotatedSortedArray {
    public static int search(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            if(arr[mid] >= arr[low]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            else{
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }
                else high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 7));
    }
}
