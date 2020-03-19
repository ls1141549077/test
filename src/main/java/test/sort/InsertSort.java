package test.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,6,3,1,2,4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        // 插入排序
        // 1. 将数组的第一个元素作为有序的
        // 2. 从第二个元素开始
        // 3. 对比有序序列 , 从右到左 , 如果小则交换位置 , 直到找到自己的合适位置
        // 时间复杂度 O(n²)
        // 可优化 : 不必每次都交换 , 可比较如果小 , 只往后推位置 , 直到直到合适的点 , 放进去即可
        // 深度优化 : 希尔排序
        // 选择排序的适用 : 数组整体有序 ， 存在小部分无序
        // 希尔排序可适用于所有无序数组
        for (int i = 1; i < arr.length; i++) {
            for(int j=i ; j >0 ; j--){
                if ( arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = j;
                }
            }
        }

    }

}
