package com.xqfofntu.binarytree;

import java.util.Stack;

/**
 * @Classname Binarytree3
 * @Date 2021/6/1
 * @Author xqf
 */

//后序遍历  递归  迭代
public class Binarytree3 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        postorder(node1);

    }

    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }

    public static void postorder2(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack();
            TreeNode prev = null;
            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                if (root.right == null || root.right == prev) {
                    System.out.println(root.val);
                    prev = root;
                    root = null;
                } else {
                    stack.push(root);
                    root = root.right;
                }
            }
        }
    }

}
