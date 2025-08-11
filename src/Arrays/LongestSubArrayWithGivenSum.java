package Arrays;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    //Brute Force Approach, will work for +,-,0
    public static int longestSubarray(int[] arr, int k){
        int max_len = 0;
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int sum = arr[i];
            for(int j = i+1; j < n; j++){
                sum += arr[j];
                if(sum == k) {
                    max_len = Math.max(max_len, j - i + 1);
                }
            }
        }
        return max_len;
    }

    //sliding window, will work for + only
    public static int longestSubarrayPositives(int[] arr, int k){
       int left = 0;
       int right = 0;
       int n = arr.length;
       int max_len = 0;
       int sum = 0;
       while(right < n){
           sum += arr[right];
           while(sum > k){
               sum -= arr[left];
               left++;
           }
           if(sum == k){
               max_len = Math.max(max_len, right - left + 1);
           }
           right++;
       }
       return max_len;
    }

    //Optimal approach - work for all - prefix sum with hashmap
    public static int longestSubarrayOptimal(int[] arr, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int p_sum = 0;
        int max_len = 0;
        for(int i = 0; i < arr.length; i++){
            p_sum += arr[i];
            if(p_sum == k) max_len = Math.max(max_len, i+1);
            if(mp.containsKey(p_sum - k)) max_len = Math.max(max_len, i - mp.get(p_sum - k));
            if(!mp.containsKey(p_sum)) mp.put(p_sum, i);
        }
        return max_len;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, -4, 0, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarrayOptimal(arr, k));

        int[] arr2 = {10, 5, 2, 7, 1, 9};
        System.out.println(longestSubarrayPositives(arr2, k));
    }
}
