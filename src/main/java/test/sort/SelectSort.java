package test.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {9,8,7,5,6,3,1,2,4};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr){
        // 选择排序 :
        // 每次循环寻找最小的 , 交换位置放于首部
        // 时间复杂度 O(n²)
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for( int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[minIdx]  ){
                    minIdx = j;
                }
            }
            if(minIdx != i) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }



    }

}
