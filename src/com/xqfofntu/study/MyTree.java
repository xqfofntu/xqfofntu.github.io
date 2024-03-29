package com.xqfofntu.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname MyTree
 * @Date 2021/4/8
 * @Author xqf
 */

//基于树形结构实现元素存储的容器
public class MyTree<E> {

    private Map<E, E> map = new HashMap<>();  //String-->String
    private Map<E, List<E>> map2 = new HashMap<>();  //String-->list

    //向容器中添加元素
    public void add(E parent, E item) {
        //先完成在树中的单节点映射
        this.map.put(item, parent);

        //完成多节点之间的映射
        List<E> list = this.map2.get(parent);
        //判断当前节点下是否含有子节点，如果没有则创建一个新的list
        if (list == null) {
            list = new ArrayList<>();
            this.map2.put(parent, list);
        }
        list.add(item);
    }

    //获取当前节点的父节点
    public E getParent(E item) {
        return this.map.get(item);
    }

    //获取当前节点的子节点
    public List<E> getChild(E item) {
        return this.map2.get(item);
    }

    //获取当前节点的兄弟节点
    public List<E> getBrother(E item) {
        //获取当前节点的父节点
        E parent = this.getParent(item);
        //获取当前父节点的所有的子节点
        List<E> list = this.getChild(parent);
        List<E> brother = new ArrayList<>();
        if (list != null) {
            brother.addAll(list);
            brother.remove(item);
        }
        return brother;
    }

    //获取当前节点的祖先节点
    public List<E> getForefathers(E item) {
        //获取当前节点的父节点
        E parent = this.getParent(item);
        //结束递归的边界条件
        if (parent == null) {
            return new ArrayList<>();
        }
        //递归调用，再次获取当前节点父节点的父节点
        List<E> list = this.getForefathers(parent);
        //将递归到的所有节点元素添加到返回的List中
        list.add(parent);
        return list;
    }


    //获取当前节点的子孙节点
    public List<E> getGrandChildren(E item) {
        //存放所有子孙节点中的元素
        List<E> list = new ArrayList<>();
        //获取当前节点的子节点
        List<E> child = this.getChild(item);
        //节点递归的边界条件
        if (child == null) {
            return list;
        }
        //遍历子节点
        for (int i = 0; i < child.size(); i++) {
            //获取节点中的元素
            E ele = child.get(i);
            List<E> temp = this.getGrandChildren(ele);
            list.add(ele);
            list.addAll(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        //实列化容器
        MyTree<String> myTree = new MyTree<>();
        //添加元素
        myTree.add("root", "生物");
        myTree.add("生物", "植物");
        myTree.add("生物", "动物");
        myTree.add("生物", "菌类");
        myTree.add("动物", "脊椎动物");
        myTree.add("动物", "脊索动物");
        myTree.add("动物", "腔肠动物");
        myTree.add("脊椎动物", "哺乳动物");
        myTree.add("脊椎动物", "鱼类");
        myTree.add("哺乳动物", "猫");
        myTree.add("哺乳动物", "牛");
        myTree.add("哺乳动物", "人");

        System.out.println("---------获取父节点----------");
        String parent = myTree.getParent("鱼类");
        System.out.println(parent);

        System.out.println("---------获取子节点----------");
        List<String> child = myTree.getChild("动物");
        for (int i = 0; i < child.size(); i++) {
            System.out.println(child.get(i));
        }

        System.out.println("---------获取兄弟节点----------");
        List<String> brother = myTree.getBrother("脊椎动物");
        for (int i = 0; i < brother.size(); i++) {
            System.out.println(brother.get(i));
        }

        System.out.println("---------获取祖先节点----------");
        List<String> foreFathers = myTree.getForefathers("人");
        for (int i = 0; i < foreFathers.size(); i++) {
            System.out.println(foreFathers.get(i));
        }

        System.out.println("---------获取子孙节点----------");
        List<String> grandChildren = myTree.getGrandChildren("root");
        for (int i = 0; i < grandChildren.size(); i++) {
            System.out.println(grandChildren.get(i));
        }

    }

}
