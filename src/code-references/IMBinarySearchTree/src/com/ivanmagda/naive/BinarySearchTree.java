package com.ivanmagda.naive;

public class BinarySearchTree {

    private Node head;

    public BinarySearchTree(int value) {
        this.head = new Node(value);
    }

    public void add(int value) {
        head.insert(value);
    }

    public Node search(int value) {
        return head.search(value);
    }

    public boolean contains(int value) {
        return head.contains(value);
    }

    public Node getMinimum() {
        return head.getMinimum();
    }

    public Node getMaximum() {
        return head.getMaximum();
    }

    @Override
    public String toString() {
        return head.toString();
    }
}
