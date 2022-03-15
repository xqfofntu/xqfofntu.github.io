package com.xqfofntu.study;

/**
 * @Classname ErTree
 * @Date 2021/4/8
 * @Author xqf
 */

//二叉树添加，排序
public class BinaryTreeSort<E extends Integer> {

    //定义节点类
    class Node<E extends Integer> {
        private E item;//存放元素
        private Node left;//存放左子树地址
        private Node right;//存放右子树地址

        Node(E item) {
            this.item = item;
        }


        //添加节点
        public void addNode(Node node) {
            //完成新结点中的元壽与当前结点中的元素的判断.
            //如果新结点中的元素小于当前结点中的元素，那么新结点则放到当前结点的左子树
            if (node.item.intValue() < this.item.intValue()) {
                if (this.left == null)
                    this.left = node;
                else
                    this.left.addNode(node);
            } else {
                //如果新结点中的元素大于当前结点中的元素，那么新结点则放到当前结点的右子树
                if (this.right == null)
                    this.right = node;
                else
                    this.right.addNode(node);
            }
        }

        //中序遍历二叉树
        public void inorderTraversal() {
            //找到最左侧的那个节点
            if (this.left != null)
                this.left.inorderTraversal();

            System.out.println(this.item);

            if (this.right != null)
                this.right.inorderTraversal();
        }

    }

    private Node root;//存放树的根节点的地址

    //将元素添加到排序器中
    public void add(E element) {
        //实列化节点对象
        Node<E> node = new Node<>(element);
        //判断当前二叉树中是否有根节点，如果没有那么新节点就为根节点
        if (this.root == null)
            this.root = node;
        else
            this.root.addNode(node);
    }


    //对元素进行排序
    public void sort() {
        //判断根节点是否为空
        if (this.root == null) return;
        this.root.inorderTraversal();
    }

    public static void main(String[] args) {
        BinaryTreeSort<Integer> sort = new BinaryTreeSort<>();
        //1,3,9,5,4,7
        sort.add(1);
        sort.add(3);
        sort.add(9);
        sort.add(5);
        sort.add(4);
        sort.add(7);
        sort.sort();
    }


}
