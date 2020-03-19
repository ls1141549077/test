package test.sum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IpTest {

    /**
     * . string类型 ip（如 192.168.175.192）转成 int 数字；并支持 int 转回 string 类型 ip ；
     */
    public static void main(String[] args) {
        int headZero = 0 ;
        int lastZero = 0 ;
        int index = 0 ;
        String ip = "192.168.175.192" ;
        String intIpStr = ip.replaceAll("\\.","");
        char[] chars = intIpStr.toCharArray();
        for (int i = 0 ; i < chars.length ; i++){
            if(chars[i]== '0'){
                headZero++ ;
            }
            if(chars[i]!='0'){
                break;
            }
            index = i ;
        }

        if(index <= 11){
            for(int i = chars.length-1 ; i > index ; i-- ){
                if(chars[i]== '0'){
                    lastZero++ ;
                }
                if(chars[i]!='0'){
                    break;
                }
            }
        }

        Integer intIp = Integer.valueOf(intIpStr);

        String s = intIp.toString();
        if(s.length() == 12){
            for(int i=0 ; i < s.length() ; i=i+3){

            }

            System.out.println(s);
        }else{
            String start0 = "" ; String end0="";
            if(headZero != 0) {
                Integer head =  Double.valueOf(Math.pow(10, headZero)).intValue();
                start0 = head.toString().substring(1) ;
            }
            if(lastZero != 0) {
                Integer end = Double.valueOf(Math.pow(10, lastZero)).intValue();
                end0 =  end.toString().substring(1) ;
            }

            s =  start0 + s + end0;


        }


    }

}
