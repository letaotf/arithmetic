package com.taofeng.arithmetic;

/**
 * <p>冒泡排序</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/9/20 上午10:05
 * @since V1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer arr[] = {1,4,9,7,5};
        bubbleSort(arr,arr.length);
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    static void bubbleSort(Integer arr[], int len){
    //每次从后往前冒一个最小值，且每次能确定一个数在序列中的最终位置
        for (int i = 0; i < len-1; i++){         //比较n-1次
                                                // 冒泡的改进，若在一趟中没有发生逆序，则该序列已有序
            for (int j = len-1; j >i; j--){    // 每次从后边冒出一个最小值
                if (arr[j] < arr[j - 1]){
                    //发生逆序，则交换
                    Integer temple = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temple;
                }
            }

        }
    }

}
