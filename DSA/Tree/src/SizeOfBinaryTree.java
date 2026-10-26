public class SizeOfBinaryTree {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


    public static int getSize(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + getSize(root.left) + getSize(root.right);
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(10);

        root.right = new Node(10);


        int size = getSize(root);

        System.out.println(size);

    }

}
