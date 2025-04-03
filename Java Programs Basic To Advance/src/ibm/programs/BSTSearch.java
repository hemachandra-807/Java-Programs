package com.ibm.programs;

class Node {
    Node left, right;
    int data;
    
    Node(int newData) {
        this.data = newData;
        this.left = this.right = null;
    }
}

public class BSTSearch {
    
    private static int isPresent(Node root, int val) {
        while (root != null) {
            if (root.data == val) {
                return 1;
            } else if (val < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(16);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(25);
        root.right.right = new Node(40);
        root.left.left.left = new Node(6);
        root.left.right.left = new Node(11);
        root.left.right.right = new Node(13);
        root.right.left.left = new Node(23);

        int[] val = {79,10,20,30,40};
        for (int v : val) {
            System.out.println(isPresent(root, v));
        }
    }
}
