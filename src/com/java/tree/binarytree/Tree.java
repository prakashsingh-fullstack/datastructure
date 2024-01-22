package com.java.tree.binarytree;

public class Tree {

    static class Node {
        int value;
        Node left, right;
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    public void insert(Node node, int value) {
        if(value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if(value > node.value) {
            if(node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println(" Inserted "+ value +" to be right of "+node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traversePreOrder(Node node){
        if(node == null) {
            return;
        }
        System.out.print(node.value+", ");
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }

    public void traverseInOrder(Node node) {
        if(node == null)
            return;
        traverseInOrder(node.left);
        System.out.print(node.value +", ");
        traverseInOrder(node.right);
    }

    public void traversePostOrder(Node node) {
        if(node == null)
            return;
        traverseInOrder(node.left);
        traversePreOrder(node.right);
        System.out.print(node.value +", ");
    }

    public static void  main(String [] args) {
        Tree tree = new Tree();
        Node node = new Node(5);
        System.out.println(" Binary Tree Example ");
        System.out.println("Building tree with node value "+ node.value);
        tree.insert(node, 2);
        tree.insert(node, 4);
        tree.insert(node, 8);
        tree.insert(node, 6);
        tree.insert(node, 7);
        tree.insert(node, 3);
        tree.insert(node, 9);
        System.out.println("***** Preorder traversal start ******");
        tree.traversePreOrder(node);
        System.out.println();
        System.out.println("***** Inorder traversal start ******");
        tree.traverseInOrder(node);
        System.out.println();
        System.out.println("***** Postorder traversal start ******");
        tree.traversePostOrder(node);
    }

}
