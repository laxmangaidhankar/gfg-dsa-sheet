import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewofBinaryTree {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }


    public static ArrayList<Integer> bfsApproach(Node root) {


        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();

                if (i == 0) {
                    list.add(curr.data);
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
        }

        return list;


    }


    public static void leftNodes(Node root, int level, ArrayList<Integer> list) {

        int size = list.size();

        if (root == null) {
            return;
        }

        if (size == level) {
            list.add(root.data);
        }

        leftNodes(root.left, level + 1, list);
        leftNodes(root.right, level + 1, list);
    }


    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(10);
        root.right = new Node(10);

        root.left.left = new Node(55);
        root.left.right = new Node(10);


        ArrayList<Integer> list;

        list = bfsApproach(root);
        System.out.println(list);
    }
}
