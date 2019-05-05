package Sort;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random ran = new Random();
        for (int i = 0; i < 100000; i++) {
            arr[i] = ran.nextInt(10000);
        }
        Sort sort = new SelectionSort();
        long start = System.nanoTime();
        sort.sort(arr);
        System.out.println(System.nanoTime() - start);
    }
}
