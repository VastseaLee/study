package Sort;

import java.util.Random;

public class CountingSort {
    public static void sort(int min, int max, int[] disArr) {
        int[] arr = new int[max - min + 1];
        for (int i : disArr) {
            arr[i - min]++;
        }
//        for (int i = 0; i < arr.length; i++) {
//            int count = arr[i];
//            while (count > 0) {
//                System.out.println(i + min);
//                count--;
//            }
//        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random ran = new Random();
        for (int i = 0; i < 10000; i++) {
            arr[i] = ran.nextInt(10000);
        }
        long start = System.nanoTime();
        sort(0, 10000, arr);
        System.out.println(System.nanoTime() - start);
    }


}
