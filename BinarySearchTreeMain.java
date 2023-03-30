package com.bridgelabz.DataStructures.BinarySearchTree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(63);

        bst.search(bst.root,65);
        bst.display(bst.root);
        bst.display(bst.root);
    }

}

