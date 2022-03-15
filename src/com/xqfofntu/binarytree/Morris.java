package com.xqfofntu.binarytree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Morris
 * @Date 2021/6/1
 * @Author xqf
 */

//线索二叉树遍历
public class Morris {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        morrisPre(node1);
        morrisMid(node1);
    }

    //前序遍历
    public static void morrisPre(TreeNode cur) {
        if (cur == null) {
            return;
        }
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {  //建立线索指针
                    mostRight.right = cur;
                    System.out.println(cur.val);
                    cur = cur.left;
                    continue;
                } else {    //删除线索指针
                    mostRight.right = null;
                }
            } else {
                System.out.println(cur.val);
            }
            cur = cur.right;
        }
    }

    //中序遍历
    public static void morrisMid(TreeNode cur) {
        if (cur == null) {
            return;
        }
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {  //建立线索指针
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                } else {    //删除线索指针
                    mostRight.right = null;
                }
            }
            System.out.println(cur.val);
            cur = cur.right;
        }
    }


}
