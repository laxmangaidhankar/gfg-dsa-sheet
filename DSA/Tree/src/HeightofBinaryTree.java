import java.util.LinkedList;
import java.util.Queue;

public class HeightofBinaryTree {


    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

    }


    public static int bfsApproach(Node root) {

        int height = -1;

        if (root == null) {
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();

                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            height++;


        }

        return height;

    }


    public static int getMaxHeight(Node root) {
        if (root == null) {
            return -1;
        }

        int left = getMaxHeight(root.left);
        int right = getMaxHeight(root.right);


        return 1 + Math.max(left, right);
    }


    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(10);
        root.right = new Node(10);

        root.left.left = new Node(55);
        root.left.right = new Node(10);

        System.out.println(bfsApproach(root));

    }
}
