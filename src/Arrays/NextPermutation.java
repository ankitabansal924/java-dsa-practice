package Arrays;

public class NextPermutation {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static int[] nextPerm(int[] arr){
        int n = arr.length;
        int index = -1;
        for(int i = n-2; i >=0; i--){
            if(arr[i+1] > arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr, 0, n-1);
            return arr;
        }
        for(int i = n-1; i > index; i--){
            if(arr[i] > arr[index]){
                swap(arr, i, index);
                break;
            }
        }

        reverse(arr, index+1, n-1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3};
        int[] ans = nextPerm(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
