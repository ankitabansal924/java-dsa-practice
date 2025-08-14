package Arrays;

public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr){
        int max_sum = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum < arr[i]) sum = arr[i];
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }

    public static void maxSumSubarray(int[] arr){
        int max_sum = arr[0];
        int start_index = 0;
        int last_index = 0;
        int temp_start_index = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(sum + arr[i] < arr[i]) {
                sum = arr[i];
                temp_start_index = i;
            }
            else{
                sum += arr[i];
            }

            if(max_sum < sum){
                max_sum = sum;
                start_index = temp_start_index;
                last_index = i;
            }
        }

        for(int i = start_index ; i <= last_index; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println("Maximum sum is: " + maxSubarraySum(nums));

        System.out.println("Maximum sum subarray is: ");
        maxSumSubarray(nums);
    }
}
