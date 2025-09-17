package BinarySearch;

public class searchInsertPos {
    public static int search(int[] arr, int k){
       int ans = 0;
       int left = 0;
       int right = arr.length - 1;
       while(left < right){
           int mid = left + (right - left)/2;
           if(arr[mid] == k){
               return mid;
           }
           if(arr[mid] < k){
               ans = mid + 1;
               left = mid + 1;
           }
           else{
                right = mid - 1;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6};
        System.out.println("Position for 1 is : " + search(nums, 1));
        System.out.println("Position for 2 is : " + search(nums, 2));
        System.out.println("Position for 4 is : " + search(nums, 4));
    }
}
