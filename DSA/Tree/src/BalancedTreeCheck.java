import java.util.ArrayList;

public class BalancedTreeCheck {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        int leftH = height(root.left);
        int rightH = height(root.right);


        int diff = Math.abs(leftH - rightH);
        return diff <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    public static int height(Node root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }


    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(10);
        root.right = new Node(10);

        root.left.left = new Node(55);
        root.left.right = new Node(10);
        root.left.right.right = new Node(10);


        System.out.println(isBalanced(root));
    }
}
