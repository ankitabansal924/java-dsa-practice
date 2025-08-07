package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Union {
    public static int[] unionUsingSet(int[] arr1, int[] arr2){
        Set<Integer> st = new LinkedHashSet<>();
        for(int num : arr1){
            st.add(num);
        }

        for(int num : arr2){
            st.add(num);
        }
        int n = st.size();
        int[] ans = new int[n];
        int index = 0;

        for(int num : st){
            ans[index++] = num;
        }
        return ans;
    }

    public static List union(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        List<Integer> ls = new ArrayList<>();
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(ls.size() == 0 || ls.get(ls.size()-1) != arr1[i])
                    ls.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(ls.size() == 0 || ls.get(ls.size()-1) != arr2[j])
                    ls.add(arr2[j]);
                j++;
            }
        }
        while(i < n1){
            if(ls.size() == 0 || ls.get(ls.size()-1) != arr1[i])
                ls.add(arr1[i]);
            i++;
        }
        while(j < n2){
            if(ls.size() == 0 || ls.get(ls.size()-1) != arr2[j])
                ls.add(arr2[j]);
            j++;
        }

        return ls;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 3, 4};
        int[] ans = unionUsingSet(arr1, arr2);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        List<Integer> ls = union(arr1, arr2);
        System.out.println(ls);
    }
}
