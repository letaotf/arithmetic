package com.taofeng.arithmetic;

/**
 * <p>希尔排序</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/9/20 上午10:05
 * @since V1.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {1, 4, 9, 7, 5};
        QuickSort(arr, 0, arr.length - 1);
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    static void QuickSort(int arr[], int start, int end) {
        //首先要选取一个中间值
        int length = (start + end) / 2;
        int modile = arr[length];
        int i = start;
        int j = end;
        while (i <= j) {

            //选择小于中间值的数据
            while (modile > arr[i]) {
                i++;
            }

            //选择大于中间值的数据
            while (modile < arr[j]) {
                j--;
            }

            //将两遍的数据进行交换
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            //递规操作

        }

        if (j < start)
            QuickSort(arr, 0, length - 1);

        if (i < end)
            QuickSort(arr, length + 1, length);

    }

}
