package com.xqf.shujujiegou;

/**
 * @Classname Bubblesort
 * @Date 2021/4/22
 * @Author xqf
 */

//冒泡排序  慢     两两比较，12、23、34、...进行length次
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 9, 7, 1, 6, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        print(arr);

    }

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
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
