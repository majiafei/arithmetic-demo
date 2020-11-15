package com.mjf.datastructure.tree;

/**
 * 二叉树
 */
public class BinaryTree<T> {

    private Node root;

    private class Node<T> {
        private T data;
        private Node left;
        private Node right;

        public Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }



}
