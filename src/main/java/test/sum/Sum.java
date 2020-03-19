package test.sum;

public class Sum {
    public static void main(String[] args) {
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


}
