import java.util.ArrayList;

public class PostOrderTraversal {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


    public static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        helper(root, list);
        return list;


    }

    public static void helper(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }


        helper(root.left, list);
        helper(root.right, list);
        list.add(root.data);
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

        // Call the method and print the result
        ArrayList<Integer> result = postOrder(root);

        System.out.println(result);
    }
}
