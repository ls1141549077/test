package test.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,6,7,4,3,9,0,10,1,2};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void bubbleSort(int[] arr){
        // 冒泡排序 :
        // 时间复杂度 : O(n²)
        // 两次循环 , 每次内层循环次数-1 , 比较相邻的两个值 , 大的放到右边
        // 内层循环次数固定-1 , 防止数组在最后一个元素取相邻元素时越界
        for(int i = 0  ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                     int temp = arr[j+1];
                     arr[j+1]= arr[j];
                     arr[j] = temp;
                }
            }
        }
    }


}
