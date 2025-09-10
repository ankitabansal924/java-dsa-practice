package BinarySearch;

public class UpperBound {
    public static int upperBound(int[] arr, int target){
        int n = arr.length;
        int ans = n;
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int lastOccurenece(int[] arr, int target){
        int ans = upperBound(arr, target);
        if(ans < arr.length && arr[ans - 1] == target) return ans - 1;
        else return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 6, 8, 9};
        System.out.println(upperBound(arr, 2));
        System.out.println(lastOccurenece(arr, 2));
    }
}
