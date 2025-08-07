package Arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;
        int i = 0;
        for(int j = i; j < nums.length; j++){
            if(nums[j] == 1){
                count++;
                max_count = Math.max(count, max_count);
            }
            else count = 0;
        }
        return max_count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 1, 1, 1, 1, 8};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
