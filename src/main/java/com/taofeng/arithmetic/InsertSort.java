package com.taofeng.arithmetic;

/**
 * <p>插入排序</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/9/20 上午10:05
 * @since V1.0
 */
public class InsertSort {

    public static void main(String[] args) {
        int arr[] = {1,4,9,7,5};
        insertSort(arr,arr.length);
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    static void insertSort(int arr[], int len){
        //每次把当前的数往前插入，可以顺序插入，改进的可以进行二分插入
        for (int i = 1; i < len; i++){
            if (arr[i] < arr[i - 1]){      //发生逆序，往前插入
                int temp = arr[i];
                int j;
                for (j = i - 1;j>=0 && arr[j]>temp; j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }

}
