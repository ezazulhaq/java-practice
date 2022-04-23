package com.haa.datastructure.binarytree.inorderwithoutrecursion;

import java.util.Stack;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        left = null;
        right = null;
    }

}

public class BinaryTree {

    Node root;

    public BinaryTree(int key) {
        this.root = new Node(key);
    }

    public BinaryTree() {
        root = null;
    }

    void inorder() {
        if (root == null)
            return;

        Stack<Node> s = new Stack<>();
        Node curr = root;

        // traverse the tree
        while (curr != null || !s.isEmpty()) {

            /*
             * Reach the left most Node of the
             * curr Node
             */
            while (curr != null) {
                /*
                 * place pointer to a tree node on
                 * the stack before traversing
                 * the node's left subtree
                 */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.key + " ");

            /*
             * we have visited the node and its
             * left subtree. Now, it's right
             * subtree's turn
             */
            curr = curr.right;
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree with Recursion and Stack");
        tree.inorder();

        System.out.println();

    }
}
