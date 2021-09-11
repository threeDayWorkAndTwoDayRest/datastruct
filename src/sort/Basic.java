package sort;

import java.util.Arrays;

/**
 * Author: hanzy
 * Date: 2021/9/11, 11:56
 * introduce:
 */
public class Basic {

    /**
     * 交换数组中m、n位置的元素
     * @param arr
     * @param m
     * @param n
     */
    public static void swap(int[] arr, int m, int n){
        int t = arr[m];
        arr[m] = arr[n];
        arr[n] = t;
    }

    public static void show(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
