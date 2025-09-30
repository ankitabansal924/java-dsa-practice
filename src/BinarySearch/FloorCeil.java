package BinarySearch;

public class FloorCeil {
    public static int[] getFloorCeil(int[] arr, int target){
        int n = arr.length;
        int[] ans = {-1, -1};


        lowerBound lb = new lowerBound();
        int ceil = lb.lowerBound(arr, target);
        if(ceil < n) ans[1] = arr[ceil];

        UpperBound ub = new UpperBound();
        int floor = ub.upperBound(arr, target);
        if(floor - 1 >= 0) ans[0] = arr[floor - 1];

        return ans;
    }

    public static int getFloor(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= target){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return arr[ans];
    }

    public static int getCeil(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return arr[ans];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int[] ans = getFloorCeil(nums, 5);
        System.out.println("floor is: " + ans[0] + " ceil is: " + ans[1]);
        System.out.println("floor is: " + getFloor(nums, 4) + " ceil is: " + getCeil(nums, 4));
    }
}
