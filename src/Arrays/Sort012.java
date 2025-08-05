package Arrays;

public class Sort012 {
    static void sortArrayApp1(int[] arr){
        int count0 = 0, count1 = 0, count2 = 0;

        for(int num : arr){
            if(num == 0) count0++;
            else if(num == 1) count1++;
            else if(num == 2) count2++;
        }
        int i = 0;
        while(count0-- != 0){
            arr[i++] = 0;
        }
        while(count1-- != 0){
            arr[i++] = 1;
        }
        while(count2-- != 0){
            arr[i++] = 2;
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortArrayApp2(int[] arr){
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, high, mid);
                high--;
            }
        }
    }

    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sortArrayApp1(arr);
        sortArrayApp2(arr);
        printArray(arr);
    }
}
