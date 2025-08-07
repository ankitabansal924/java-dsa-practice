package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleOnes {
    public static int singleNumberUsingMap(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            int value = mp.getOrDefault(num, 0);
            mp.put(num, value + 1);
        }
        for(Map.Entry<Integer, Integer> it : mp.entrySet()){
            if(it.getValue() == 1) return it.getKey();
        }
        return -1;
    }

    public static int singleNumber(int[] arr){
        int ans = 0;
        for(int num : arr){
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 1, 4};
        System.out.println(singleNumberUsingMap(arr));
        System.out.println(singleNumber(arr));
    }
}
