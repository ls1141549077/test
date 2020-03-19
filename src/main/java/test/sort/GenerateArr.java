package test.sort;

public class GenerateArr {
    /**
     * 随机生成数组
     * @param len
     * @param max
     * @return
     */
    public static int[]  gennerateArray(int len,int max){
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*max);
        }
        return arr;
    }

}
