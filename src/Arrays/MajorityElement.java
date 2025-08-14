package Arrays;

public class MajorityElement {
    public static int majorityElementUsingMooreVoting(int[] arr){
        int count = 0;
        int candidate = 0;
        for(int num : arr){
            if(count == 0) candidate = num;
            if(candidate == num) count++;
            else count--;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2, 2, 2};
        System.out.println(majorityElementUsingMooreVoting(arr));
    }
}
