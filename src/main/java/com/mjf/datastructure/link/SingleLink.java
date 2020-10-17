package com.mjf.datastructure.link;

/**
 * 单向链表
 * @author majiafei
 * @date 2020/10/17 11:08
 */
public class SingleLink<T> {

    /**
     * 头结点
     */
    private Node<T> first;

    /**
     * 尾结点
     */
    private Node<T> tail;

    private class Node<T> {
        /**
         * 存放数据
         */
        private T data;

        /**
         * 指向下一个节点
         */
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public void put(T data) {
        Node node = new Node(data, null);
        Node last = tail;
        if (last == null) {
            first = node;
        } else {
            last.next = node;
        }
        tail = node;
    }

    public Node get(T data) {
        for (Node node = first; node != null; node = node.next) {
            if (node.data == data) {
                return node;
            }
        }

        return null;
    }

    public void traverse() {
        for (Node node = first; node != null; node = node.next) {
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        SingleLink<Integer> singleLink = new SingleLink<Integer>();
        for (int i = 0; i < 10; i++) {
            singleLink.put(i);
        }

        singleLink.traverse();

        System.out.println(singleLink.get(2));
    }

}
