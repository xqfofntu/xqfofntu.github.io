package com.xqfofntu.binarytree;

/**
 * @Classname TreeNode
 * @Date 2021/6/1
 * @Author xqf
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public int deep;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
