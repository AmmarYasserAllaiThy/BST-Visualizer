package sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    /**
     * static classes
     */
    private static class Node {
        final int data;
        Node left, right;

        public Node(int data) {
            this(data, null, null);
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node insert(int data) {
            if (this.data > data) {
                if (this.left == null) this.left = new Node(data);
                else this.left.insert(data);
            } else {
                if (this.right == null) this.right = new Node(data);
                else this.right.insert(data);
            }

            return this;
        }

        Node remove(int data) {
            return null;
        }

        boolean contains(int data) {
            if (this.data > data) {
                if (left != null)
                    return left.contains(data);

            } else if (this.data < data) {
                if (right != null)
                    return right.contains(data);

            } else return true;

            return false;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    private static class Traversal {
        private static Traversal instance = null;
        private static List<Node> result;

        public static Traversal getInstance() {
            if (instance == null) instance = new Traversal();
            result = new ArrayList<>();
            return instance;
        }

        public List<Node> getResult() {
            return result;
        }


        private void inOrder(Node root) {
            if (root == null) return;

            if (root.left != null) inOrder(root.left);
            result.add(root);
            inOrder(root.right);
        }

        private void preOrder(Node root) {
            result.add(root);

            if (root.left != null) preOrder(root.left);
            if (root.right != null) preOrder(root.right);
        }

        private void postOrder(Node root) {
            if (root.left != null) postOrder(root.left);
            if (root.right != null) postOrder(root.right);

            result.add(root);
        }

        private void levelOrder(Node root) {
            if (root == null) return;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null); // NEW_LEVEL_SEPARATOR

            while (!queue.isEmpty()) {
                Node curNode = queue.poll();

                if (curNode == null) { // NEW_LEVEL_SEPARATOR
                    if (!queue.isEmpty()) queue.add(null); // NEW_LEVEL_SEPARATOR
                    continue;
                }

                if (curNode.left != null) queue.add(curNode.left);
                if (curNode.right != null) queue.add(curNode.right);

                result.add(curNode);
            }
        }
    }


    /**
     * Member properties and Constructor
     */
    private final Node root;

    public BinaryTree(int rootData) {
        this.root = new Node(rootData);
    }

    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }


    /**
     * Node Ops
     */
    public Node insert(int data) {
        return root.insert(data);
    }

    public Node insert(int... data) {
        if (data.length > 0) for (int datum : data) insert(datum);
        return root;
    }

    public Node remove(int data) {
        return root.remove(data);
    }

    public boolean contains(int data) {
        return root.contains(data);
    }


    /**
     * Traversal Ops
     */
    public List<Node> inOrderTraversal() {
        Traversal traversal = Traversal.getInstance();
        traversal.inOrder(root);

        return traversal.getResult();
    }

    public List<Node> preOrderTraversal() {
        Traversal traversal = Traversal.getInstance();
        traversal.preOrder(root);

        return traversal.getResult();
    }

    public List<Node> postOrderTraversal() {
        Traversal traversal = Traversal.getInstance();
        traversal.postOrder(root);

        return traversal.getResult();
    }

    public List<Node> levelOrderTraversal() {
        Traversal traversal = Traversal.getInstance();
        traversal.levelOrder(root);

        return traversal.getResult();
    }

}