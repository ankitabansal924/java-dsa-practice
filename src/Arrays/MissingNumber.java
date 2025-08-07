package Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expTotal = n*(n+1)/2;
        int total = 0;
        for(int i = 0; i < n; i++){
            total += nums[i];
        }
        return expTotal - total;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
