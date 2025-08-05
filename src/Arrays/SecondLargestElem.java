package Arrays;

public class SecondLargestElem {
    public static int secondLargestEl(int[] arr){
        int largest = arr[0];
        int sLargest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int ans = secondLargestEl(arr);
        System.out.println("Second Largest element of array is: " + ans);
    }
}
