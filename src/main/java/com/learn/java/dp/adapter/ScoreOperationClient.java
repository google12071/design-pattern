package com.learn.java.dp.adapter;

public class ScoreOperationClient {
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        StudentScoreOperation adapter = new StudentScoreOperationAdapter();
        int[] scoreArray = {84, 76, 50, 10, 101, 69, 90, 91, 88, 96};
        scoreArray = adapter.sort(scoreArray);
        display(scoreArray);
        boolean exist = adapter.scoreSearch(scoreArray, 90);
        System.out.println(exist);
    }
}
