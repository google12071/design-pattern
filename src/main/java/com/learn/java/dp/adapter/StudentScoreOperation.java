package com.learn.java.dp.adapter;

/**
 * 学生成绩操作
 */
public interface StudentScoreOperation {
    /**
     * 学生成绩排序
     *
     * @param scoreArray
     * @return
     */
    int[] sort(int[] scoreArray);

    /**
     * 查找学生成绩是否存在
     *
     * @param scoreArray
     * @param target
     * @return
     */
    boolean scoreSearch(int[] scoreArray, int target);
}
