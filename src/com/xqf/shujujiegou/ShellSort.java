package com.xqf.shujujiegou;

/**
 * @Classname ShellSort
 * @Date 2021/4/22
 * @Author xqf
 */
//希尔排序
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 9, 7, 1, 6, 2};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);
        print(arr);

    }

    public void sort(int[] arr) {

        for (int gap = 4; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j - gap];
                        arr[j - gap] = temp;
                    }
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
