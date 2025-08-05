package Arrays;

public class LargestELem {
    public static int largestEl(int[] arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans) ans = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int ans = largestEl(arr);
        System.out.println("Largest element is: " + ans);
    }
}
