package BinarySearch;

public class findX {
    public static int search(int[] arr, int X){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low - (low - high)/2;
            if(arr[mid] == X){
                return mid;
            }
            else if(arr[mid] > X) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 4, 6, 8};
        System.out.println(search(arr, 8));
    }
}
