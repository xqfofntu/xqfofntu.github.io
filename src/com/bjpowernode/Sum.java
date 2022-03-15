package com.bjpowernode;


import javafx.beans.binding.ListExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println(6 << 2);
        System.out.println(5 << 3);
        System.out.println(3 << 3);

        List<String> testList = new ArrayList<String>();
        testList.add("test1");
        testList.add("test2");
        testList.add("test3");
        testList.add("test4");
//        for (String test : testList) {
//            if ("test2".equals(test)) {
//                testList.remove(test);    //遍历不能直接增加或删除
//            }
//
//        }

        //或者倒序删除
        Iterator<String> iterator = testList.iterator();
        while (iterator.hasNext()) {
            String integer = iterator.next();
            if ("test2".equals(iterator))
                iterator.remove();

        }

        Integer f1 = 100, f2 = 100, f3 = 128, f4 = 128;

        System.out.println(f1 == f2);
        System.out.println(f3 == f4);


    }

}
