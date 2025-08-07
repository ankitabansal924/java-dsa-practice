package Arrays;

public class Move0toEnd {
    public static void moveZero(int[] arr){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = index; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 3, 4, 0, 5};
        moveZero(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
