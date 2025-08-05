package Arrays;

public class SortedRotatedArray {
    public static boolean checkSortedRotatedArr(int[] arr){
        //hme breakpoints check krne hai, large elem small elem se pehle kitni baar aa rha h
        // rotated sorted array me max 1 hi breakpoint hoga

        int count = 0; // breakpoints count krne ke lie var
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[(i+1) % n]) count++;
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {3, 4, 2, 1, 2};
        boolean ans1 = checkSortedRotatedArr(arr1);
        boolean ans2 = checkSortedRotatedArr(arr2);

        System.out.println(ans1 + " " + ans2);
    }
}
