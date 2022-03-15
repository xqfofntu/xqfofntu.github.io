package com.xqfofntu.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Binarytree4
 * @Date 2021/6/1
 * @Author xqf
 */

//层序遍历  递归  迭代
public class Binarytree4 {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node6, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        ArrayList list = new ArrayList();
        levelOrder(node1, 1, list);
        System.out.println(Arrays.toString(list.toArray()));
        levelOrder2(node1);
    }

    public static void levelOrder(TreeNode root, int i, ArrayList list) {
        if (root == null) {
            return;
        }
        int lenght = list.size();
        if (lenght <= i) {
            for (int j = 0; j <= i - lenght; j++) {
                list.add(lenght + j, null);
            }
        }
        list.set(i, root.val);
        levelOrder(root.left, 2 * i, list);
        levelOrder(root.right, 2 * i + 1, list);
    }

    public static void levelOrder2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();    //队列 先进先出
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node != null) {
                System.out.println(node.val);
                q.add(node.left);
                q.add(node.right);
            }
        }
    }
}
