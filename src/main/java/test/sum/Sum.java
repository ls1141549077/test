package test.sum;

import java.math.BigDecimal;

public class Sum {
    public static void main(String[] args) {
        testBigSum();
    }

    public static void testSum(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] ==20 ){
                    System.out.println(arr[i] + "+" +arr[j]);
                }
            }
        }
    }


    public static void testBigSum(){
        BigDecimal B1 = new BigDecimal("0");
        B1=B1.add(new BigDecimal("9.07"));
        System.out.println(B1);


    }


}
