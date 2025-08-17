package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static ArrayList<Integer> LeadersOfArray(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        ans.add(arr[n-1]);
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > ans.get(ans.size()-1)){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 4, 5, 1, -4, -5};
        ArrayList<Integer> ans = LeadersOfArray(arr);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
