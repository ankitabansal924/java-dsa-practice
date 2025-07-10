package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    //Using sorting
    static int kthSmallestApp1(int[] arr, int k){
        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        return copy[k-1];
    }

    //Using priority queue(min Heap)
    static int kthSmallestApp2(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            pq.add(num);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek();
    }


    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k=4;
        System.out.println(kthSmallestApp1(arr, k));

        Integer[] array = new Integer[]{10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        System.out.println(kthSmallestApp2(arr, k));
    }
}
