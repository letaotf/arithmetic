package com.taofeng.arithmetic;

/**
 * <p>选择排序</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/9/20 上午10:05
 * @since V1.0
 */
public class SelectSort {

    public static void main(String[] args) {
        Integer arr[] = {1,4,9,7,5};
        selectSort(arr,arr.length);
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    static void selectSort(Integer arr[], int len){

        for (int i = 0; i < len-1; i++){
            //取出最小的
            int min = i;

            for (int j = i + 1 ; j < len ; j++){
                if (arr[min] > arr[j]){
                     min = j;
                }
            }
            //发生逆序，则交换
            Integer temple = arr[i];
            arr[i] = arr[min];
            arr[min] = temple;

        }
    }

}
