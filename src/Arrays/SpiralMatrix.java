package Arrays;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(ArrayList<ArrayList<Integer>> matrix){
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = cols-1;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                ans.add(matrix.get(top).get(i));
            }
            top++;

            for(int i = top; i <= bottom; i++){
                ans.add(matrix.get(i).get(right));
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans.add(matrix.get(bottom).get(i));
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans.add(matrix.get(i).get(left));
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        System.out.println(spiralOrder(matrix));
    }
}
