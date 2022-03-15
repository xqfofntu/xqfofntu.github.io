package 力扣;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @Author xqf
 */
//倒序

public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        int fh = 1;
//        int result = 0;
//        if(x < 0){
//            fh = -1;
//            x *= -1;
//        }
//        while (x != 0){
//            result = result *10 + x % 10;
//            x /=10;
//        }
//        result *= fh;
//        System.out.println(result);


        String temp = "";
        int result = 0;
        if (x < 0) {
            temp = "-" + new StringBuffer(String.valueOf(x).substring(1)).reverse().toString();
        } else {
            temp = new StringBuffer(String.valueOf(x)).reverse().toString();
        }
        if (temp.equals("")) {
            temp = "0";
        }

        result = Integer.valueOf(temp);

        System.out.println(result);


    }
}


