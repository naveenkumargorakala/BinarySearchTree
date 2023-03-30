package com.bridgelabz.DataStructures.BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {
    INode<T> root;

    public void add(T data) {
        INode<T> newNode = new INode<>(data);
        if (root == null) {
            root = newNode;
            return;
        }
    }
}
