package test.sort;

public class QuickSort {



    public static void main(String[] args) {
        // int[] arr = {43,56,10,23,67,99,58,45,66} ;
        int[] arr = {5,4,9,6,2,3,1,7,8,10} ;
        int[] arr1 = {2,4,1,3,5,6,9,7,8};
        quickSortV1(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void quickSortV1(int[] arr , int low , int high){
        // 1. 取基准值 ， 默认取 arr[start]
        // 2. 从后往前找比基准值少的数
        // 3. 从前往后找比基准值大的数
        // 4. 比较找到的两个数的下标是否符合 low < high
        // 5. 符合则交换 ， 不符合则交换基准值
        // 6. 分治法 ， 对前后两个数组分别进行排序（递归）

        if(low >= high){
            return;
        }
        int base = arr[low];
        int LOW = low ;
        int HIGH = high ;
        while (low < high){
            while (arr[high] > base && high > low){
                high--;
            }

            while (arr[low] < base && high > low){
                low++;
            }
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
        }
        arr[low] = base;

        quickSortV1(arr,LOW,low-1);
        quickSortV1(arr,low+1,HIGH);

    }





}
