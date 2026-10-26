public class CountInternalNodes {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int getInternalNodes(Node root) {
        if (root == null) {
            return 0;
        }


        if ((root == null) || (root.left == null && root.right == null)) {
            return 0;
        }

        return 1 + getInternalNodes(root.left) + getInternalNodes(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(10);
        root.right = new Node(10);

        root.left.left = new Node(10);
        root.left.right = new Node(10);

        int internalNodes = getInternalNodes(root);
        System.out.println(internalNodes);

    }
}
