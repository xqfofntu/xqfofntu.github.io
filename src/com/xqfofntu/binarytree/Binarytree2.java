package com.xqfofntu.binarytree;

import java.util.Stack;

/**
 * @Classname Binarytree2
 * @Date 2021/6/1
 * @Author xqf
 */

//中序遍历  递归  迭代
public class Binarytree2 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        midorder(node1);
        midorder2(node1);

    }

    public static void midorder(TreeNode root) {
        if (root == null) {
            return;
        }
        midorder(root.left);
        System.out.println(root.val);
        midorder(root.right);
    }

    public static void midorder2(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack();
            while (!stack.isEmpty() || root != null) {
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    System.out.println(root.val);
                    root = root.right;
                }
            }
        }
    }
}


