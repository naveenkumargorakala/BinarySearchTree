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

    public void display(INode<T> currentPointer){
        if (currentPointer == null)
            return;
        display(currentPointer.nextL);
        System.out.print(currentPointer.data+" ");
        display(currentPointer.nextR);
    }

    public void search(INode<T> currentPointer,T data){
        while(currentPointer!=null) {
            int value= data.compareTo(currentPointer.data);
            switch (value){
                case -1:
                    currentPointer = currentPointer.nextL;
                    break;
                case 1:
                    currentPointer = currentPointer.nextR;
                    break;
                default:
                    System.out.println("Element Found!!!");
                    return;
            }
        }
        System.out.println("Element Not Found!!!");
    }
}
