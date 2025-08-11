package Arrays;

import java.util.HashMap;

public class TwoSUm {

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            mp.put(nums[i], i);
        }

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if(mp.containsKey(complement) && mp.get(complement) != i){
                return new int[]{i, mp.get(complement)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

        int[] ans2 = twoSumUsingHashMap(arr, target);
        System.out.println(ans2[0] + " " + ans2[1]);
    }
}
