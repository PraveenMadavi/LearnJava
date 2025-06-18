package BinaryTree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Tree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        private int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) return null;
            Node rootNode = new Node(nodes[idx]);
            rootNode.left = buildTree(nodes);
            rootNode.right = buildTree(nodes);
            return rootNode;
        }

        public void preOrder(Node rootNode) {
            if (Objects.isNull(rootNode)) return;

            System.out.print(rootNode.data + ", ");
            preOrder(rootNode.left);
            preOrder(rootNode.right);
        }

        public void midOrder(Node rootNode) {
            if (Objects.isNull(rootNode)) return;

            midOrder(rootNode.left);
            System.out.print(rootNode.data + ", ");
            midOrder(rootNode.right);
        }

        public void postOrder(Node rootNode) {
            if (Objects.isNull(rootNode)) return;

            postOrder(rootNode.left);
            postOrder(rootNode.right);
            System.out.print(rootNode.data + ", ");
        }

        public void levelOrder(Node root) {
            if (Objects.isNull(root)) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) break;
                    else q.add(null);
                } else {
                    System.out.print(" " + currNode.data);
                    if (currNode.left != null) q.add(currNode.left);
                    if (currNode.right != null) q.add(currNode.right);
                }
            }


        }

        public int totalNodes(Node root) {
            if (Objects.isNull(root)) return 0;

            int rootNode = 1;
            int left = 0;
            int right = 0;
            if (!Objects.isNull(root.left)) {
                left = totalNodes(root.left);
            }
            if (!Objects.isNull(root.right)) {
                right = totalNodes(root.right);
            }
            rootNode += left + right;

            return rootNode;
        }

        public int sumOfNodes(Node root) {
            if (Objects.isNull(root)) return 0;
            return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
        }

        public int depth(Node root) {
            if (Objects.isNull(root)) return 0;

            int depthLeft = depth(root.left);
            int depthRight = depth(root.right);

            return Math.max(depthLeft, depthRight) + 1;
        }

        public static class treeInfo {
            int height;
            int dia;

            treeInfo(int height, int dia) {
                this.height = height;
                this.dia = dia;
            }
        }

        public treeInfo treeDia(Node root) {
            if (Objects.isNull(root)) return new treeInfo(0, 0);

            treeInfo leftTree = treeDia(root.left);
            treeInfo rightTree = treeDia(root.right);


            int leftDia = leftTree.dia;
            int rightDia = rightTree.dia;
            int rootDia = leftTree.height + rightTree.height + 1;
            int maxDia = Math.max(rootDia, Math.max(leftDia, rightDia));

            int height = Math.max(leftTree.height, rightTree.height) + 1;

            return new treeInfo(height, maxDia);
        }

        public int sumOfLevel(Node root, int l) {
            if (Objects.isNull(root)) return 0;

            Queue<Node> queue = new LinkedList<>();
            int level = 1;
            int sum = 0;
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                if (currentNode == null) {
                    level++;
                    if (queue.isEmpty()) break;
                    else queue.add(null);
                } else {
                    if (level == l) sum += currentNode.data;
                    if (level < l) {
                        if (currentNode.left != null) queue.add(currentNode.left);
                        if (currentNode.right != null) queue.add(currentNode.right);
                    }
                }
            }
            return sum;
        }
    }


    public static void main(String[] args) {
//        int[] nodes = {4, 2, 5, -1, -1, 3, -1, -1, 9, 1, -1, -1, 8, -1, -1};
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, 7, -1, -1, 3, -1, 6, -1, 9, -1, 10, -1, 20, -1, -1};

        BinaryTree bt = new BinaryTree();
        Node rootNode = bt.buildTree(nodes);
        assert rootNode != null;
        System.out.println(rootNode.data);

        System.out.println("preOrder");
        bt.preOrder(rootNode);
        System.out.println();
        System.out.println("midOrder");
        bt.midOrder(rootNode);
        System.out.println();
        System.out.println("postOrder");
        bt.postOrder(rootNode);
        System.out.println();
        System.out.println("level orders");
        bt.levelOrder(rootNode);
        int totalNodes = bt.totalNodes(rootNode);
        System.out.println("Total nodes are : " + totalNodes);
        System.out.println("The sum of Nodes are : " + bt.sumOfNodes(rootNode));
        System.out.println("The depth of the tree is : " + bt.depth(rootNode));
        System.out.println("The diameter of the tree is : " + bt.treeDia(rootNode).dia);
        int level=1;
        System.out.println("Sum of level "+level+" is : "+ bt.sumOfLevel(rootNode,level));
    }
}
