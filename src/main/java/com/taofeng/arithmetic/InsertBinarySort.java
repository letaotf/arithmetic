package com.taofeng.arithmetic;

/**
 * <p>折半回调</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/9/20 上午10:05
 * @since V1.0
 */
public class InsertBinarySort {

    public static void main(String[] args) {
        int arr[] = {1,4,9,7,5};
        insertSort(arr,arr.length);
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    static void insertSort(int arr[], int len){
        //改进的插入排序，往前插入比较时，进行二分查找
        for (int i = 1; i < len; i++){
            if (arr[i] < arr[i - 1]){
                int temp = arr[i];
                int low = 0, high = i - 1, mid;
                while (low <= high){
                    mid = (low + high) / 2;
                    if (temp < arr[mid]){
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }
                }
                for (int j = i; j >low; j--){
                    arr[j] = arr[j - 1];
                }
                arr[low] = temp;
            }
        }
    }

}
