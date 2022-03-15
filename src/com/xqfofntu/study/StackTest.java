package com.xqfofntu.study;

import java.util.Stack;

/**
 * @Classname StackTest
 * @Date 2021/4/3
 * @Author xqf
 */

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("g");
        //在顶部添加
        stack.push("a");
        stack.push("b");
        stack.add("f");
        stack.push("c");

        //删除顶部的元素，并返回它的值
        String p1 = stack.pop();
        System.out.println(p1);
        System.out.println(stack);
    }
}
