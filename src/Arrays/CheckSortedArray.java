package Arrays;

public class CheckSortedArray {
    public static boolean checkArrSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 9};
        boolean ans = checkArrSorted(arr);
        System.out.println(ans);
    }
}
