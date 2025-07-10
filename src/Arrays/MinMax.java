package Arrays;

import java.util.Arrays;

public class MinMax {

    static class Pair{
        int min;
        int max;
    }

    // App1: Separate loops for min and max
    static int[] getMinMaxApp1(int[] arr){
        int n = arr.length;
        int min = arr[0], max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < min) min = arr[i];
        }
        for(int i = 1; i < n; i++){
            if(arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    // App2: One loop with if-else
    static Pair getMinMaxApp2(int[] arr){
        Pair minmax = new Pair();
        int n = arr.length;
        int min = arr[0], max = arr[0];
        for(int i = 1;i < n; i++){
            if(arr[i] < min) min = arr[i];
            else if(arr[i] > max) max = arr[i];
        }
        minmax.min = min;
        minmax.max = max;
        return minmax;
    }

    // App3: Using Arrays.sort (but on a copy)
    static Pair getMinMaxApp3(int[] arr){
        Pair minmax = new Pair();
        int n = arr.length;
        int[] copy = Arrays.copyOf(arr,n);
        Arrays.sort(copy);
        minmax.min = copy[0];
        minmax.max = copy[n-1];
        return minmax;
    }

    // App4: Tournament-style comparison (iterative)
    static Pair getMinMaxApp4(int[] arr){
        Pair minmax = new Pair();
        int n = arr.length;
        int min, max, i;

        if(n % 2 == 0){
            if(arr[0] > arr[1]){
                min = arr[1];
                max = arr[0];
            } else {
                min = arr[0];
                max = arr[1];
            }
            i = 2;
        } else {
            min = max = arr[0];
            i = 1;
        }
        while(i < n-1){
            int localMin, localMax;
            if(arr[i] < arr[i+1]){
                localMax = arr[i+1];
                localMin = arr[i];
            } else {
                localMin = arr[i+1];
                localMax = arr[i];
            }
            if(localMax > max) max = localMax;
            if(localMin < min) min = localMin;
            i += 2;
        }

        minmax.min = min;
        minmax.max = max;
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9};

        int[] sol1 = getMinMaxApp1(arr);
        System.out.println("min elem " + sol1[0] + " max elem " + sol1[1]);

        Pair sol2 = getMinMaxApp2(arr);
        System.out.println("min elem " + sol2.min + " max elem " + sol2.max);

        Pair sol3 = getMinMaxApp3(arr);
        System.out.println("min elem " + sol3.min + " max elem " + sol3.max);

        Pair sol4 = getMinMaxApp4(arr);
        System.out.println("min elem " + sol4.min + " max elem " + sol4.max);
    }
}
