public class CountLeavesinBinaryTree {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int countLeavesNode(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null || root.right == null) {
            return 1;
        }

        return 1 + countLeavesNode(root.left) + countLeavesNode(root.right);
    }


    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.right = new Node(7);
        root.left.right.right = new Node(10);

        root.right.left = new Node(10);
        root.right.left.left = new Node(6);

        root.right.right = new Node(6);

        int result = countLeavesNode(root);

        System.out.println(result);
    }

}
