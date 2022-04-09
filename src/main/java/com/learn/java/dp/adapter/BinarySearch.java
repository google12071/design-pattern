package com.learn.java.dp.adapter;

/**
 * 二分搜索
 */
public class BinarySearch {
    /**
     * 二分查找
     *
     * @param arr
     * @param key
     * @return
     */
    public int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //中间值
            int midVal = arr[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}
