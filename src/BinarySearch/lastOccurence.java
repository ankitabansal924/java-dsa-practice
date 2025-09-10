package BinarySearch;

public class lastOccurence {
    public static int lastOccurence(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        System.out.println(lastOccurence(arr, 2));
    }
}
