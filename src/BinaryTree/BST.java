package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class BSTree {

        public Node createBST(Node root, int data) {
            if (Objects.isNull(root)) return new Node(data);

            if (data < root.data) {
                root.left = createBST(root.left, data);
            }
            if (data > root.data) {
                root.right = createBST(root.right, data);
            }
            return root;
        }

        public Node deleteNode(Node root, int data) {
            if (Objects.isNull(root)) return null;

            if (data == root.data) {
                //leaf node
                if (root.left == null && root.right == null) {
                    return null;
                }
                //single child
                else if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                //double child
                else {
                    Node successor = root.right;
                    while (successor.left != null) {
                        successor = successor.left;
                    }
                    root.data = successor.data;
                    root.right = deleteNode(root.right, successor.data);
                }

            } else if (data < root.data) {
                root.left = deleteNode(root.left, data);
            } else {
                root.right = deleteNode(root.right, data);
            }
            return root;
        }

        public void inOrder(Node root) {
            if (Objects.isNull(root)) return;

            inOrder(root.left);
            System.out.print(root.data + ", ");
            inOrder(root.right);
        }

        public void leafPath(Node root, ArrayList<Integer> path) {
            if (Objects.isNull(root)) return;
            path.add(root.data);
            if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
                System.out.println(path);
            }else {
                leafPath(root.left, path);
                leafPath(root.right, path);
            }
            path.removeLast();
        }
    }


    public static void main(String[] args) {
        int[] nodes = {5, 3, 1, 7, 4, 9, 8, 2, 6};

        BSTree BST = new BSTree();

        Node root = null;
        for (int i : nodes) {
            root = BST.createBST(root, i);
        }

        BST.inOrder(root);
//        System.out.println("After deletion one node");
//        BST.deleteNode(root, 7);
        BST.inOrder(root);
        System.out.println();
        System.out.println("Leaf paths.");
        BST.leafPath(root, new ArrayList<>());

    }
}
