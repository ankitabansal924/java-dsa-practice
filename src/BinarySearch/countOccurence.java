package BinarySearch;

public class countOccurence {
    public static int countOccurence(int[] arr, int target){
        return lastOccurence.lastOccurence(arr, target) - firstOccurence.firstOccurence(arr, target) + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        System.out.println("Number of occurence of target is: " + countOccurence(arr, 2));
    }
}
