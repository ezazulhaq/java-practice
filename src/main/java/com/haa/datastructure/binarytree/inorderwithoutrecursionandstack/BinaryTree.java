package com.haa.datastructure.binarytree.inorderwithoutrecursionandstack;

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

    void morrisTraversal(Node root) {
        Node current;
        Node pre;

        if (root == null)
            return;

        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.key + " ");
                current = current.right;
            } else {
                /*
                 * Find the inorder
                 * predecessor of current
                 */
                pre = current.left;
                while (pre.right != null
                        && pre.right != current)
                    pre = pre.right;

                /*
                 * Make current as right
                 * child of its
                 * inorder predecessor
                 */
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }

                /*
                 * Revert the changes made
                 * in the 'if' part
                 * to restore the original
                 * tree i.e., fix
                 * the right child of predecessor
                 */
                else {
                    pre.right = null;
                    System.out.print(current.key + " ");
                    current = current.right;
                } /*
                   * End of if condition pre->right == NULL
                   */

            } /* End of if condition current->left == NULL */

        } /* End of while */
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree without Recursion and without Stack");
        tree.morrisTraversal(tree.root);

        System.out.println();

    }
}
