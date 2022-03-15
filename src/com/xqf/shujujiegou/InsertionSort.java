package com.xqf.shujujiegou;

/**
 * @Classname InsertionSort
 * @Date 2021/4/22
 * @Author xqf
 */
//插入排序  推荐，快，稳      12、23-12、34-23-12、...
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 9, 7, 1, 6, 2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        print(arr);

    }

    public void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i--;
                }
            }
        }
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
