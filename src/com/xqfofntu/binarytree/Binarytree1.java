package com.xqfofntu.binarytree;


import java.util.Stack;

/**
 * @Classname Binarytree
 * @Date 2021/6/1
 * @Author xqf
 */

//前序遍历 递归 迭代
public class Binarytree1 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        preorder(node1);
        preorder2(node1);

    }

    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void preorder2(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack();
            stack.add(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                if (root != null) {
                    System.out.println(root.val);
                    stack.push(root.right);
                    stack.push(root.left);
                }
            }
        }
    }
}

