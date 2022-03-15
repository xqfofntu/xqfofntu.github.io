package com.xqfofntu.study;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname LinkedListTest
 * @Date 2021/4/3
 * @Author xqf
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("---------------------------------------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("---------------------------------------");

        linkedList.addLast("e");

        for (String str : linkedList) {
            System.out.println(str);
        }

        System.out.println("-------------------------------------");

        linkedList.removeFirst();
        linkedList.removeLast();

        for (String str : linkedList) {
            System.out.println(str);
        }
    }
}
