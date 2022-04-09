package com.learn.java.dp.adapter;

/**
 * 快排算法
 */
public class QuickSort {
    /**
     * 快速排序
     *
     * @param arr
     * @return
     */
    public int[] quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public void sort(int[] arr, int p, int r) {
        int q = 0;
        if (p < r) {
            q = partition(arr, p, r);
            sort(arr, p, q - 1);
            sort(arr, q + 1, r);
        }
    }

    public int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int j = p - 1;
        for (int i = p; i <= r - 1; i++) {
            if (arr[i] <= x) {
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr, j + 1, r);
        return j + 1;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
