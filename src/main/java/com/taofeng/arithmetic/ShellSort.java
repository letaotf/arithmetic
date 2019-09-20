package com.taofeng.arithmetic;

/**
 * <p>希尔排序</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/9/20 上午10:05
 * @since V1.0
 */
public class ShellSort {

    public static void main(String[] args) {
        int arr[] = {1,4,9,7,5};
        shellSort(arr,arr.length);
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    static void shellSort(int arr[], int len){
        //每次选择一个gap，对相隔gap的数进行插入排序
        for (int gap = len / 2; gap > 0; gap /= 2){
            for (int i = 0; i < len; i = i + gap){
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && temp < arr[j-gap]; j -= gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

}
