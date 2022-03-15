package com.xqf.shujujiegou;

/**
 * @Classname SelectionSort
 * @Date 2021/4/13
 * @Author xqf
 */

//选择排序  不稳    12-13-14-.....
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 9, 7, 1, 6, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            swap(arr, i, minPos);

        }
        print(arr);

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
