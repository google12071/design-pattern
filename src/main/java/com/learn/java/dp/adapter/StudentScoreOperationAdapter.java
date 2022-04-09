package com.learn.java.dp.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 学生成绩操作适配器
 */
@Slf4j
public class StudentScoreOperationAdapter implements StudentScoreOperation {
    /**
     * 适配快速排序算法
     */
    private QuickSort sort;
    /**
     * 适配二分搜索
     */
    private BinarySearch search;

    public StudentScoreOperationAdapter() {
        this.sort = new QuickSort();
        this.search = new BinarySearch();
    }

    @Override
    public int[] sort(int[] scoreArray) {
        return sort.quickSort(scoreArray);
    }

    @Override
    public boolean scoreSearch(int[] scoreArray, int target) {
        int result = search.binarySearch(scoreArray, target);
        return result > 0;
    }
}
