public class SumOfBinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

    }

    public static int getSum(Node root){
        if(root==null){
            return 0;
        }

        return root.data + getSum(root.left) + getSum(root.right);
    }


    public static void main(String[] args){
        Node root = new Node(1);

        root.left = new Node(2);

        root.left.left = new Node(23);
        root.left.right = new Node(22);


        root.right.left = new Node(22);
        root.right.right = new Node(12);


        int sum = getSum(root);

        System.out.println(sum);
    }
}
