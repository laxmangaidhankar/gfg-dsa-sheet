public class LL {

    Node head;
    Node tail;
    int size;


    public LL() {
        this.size = 0;
    }


    public void insertMiddle(int val, int pos) {

        if (pos < 0 || pos > size) {
            return;
        }


        if (pos == 0) {
            Node node = new Node(val);
            head = node;
            size++;
            return;
        }

        if (pos == size) {
            Node node = new Node(val);

        }

        Node temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }


        Node node = new Node(val, temp.next);

        temp.next = node;
        size++;
    }


    public void insertFirst(int val) {

        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);

        if (tail == null) {
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
        size++;


    }

    public Node get(int pos) {

        Node temp = head;

        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }

        return temp;
    }


    public void deleteMiddle(int pos){

        Node prev = get(pos - 1);

        prev.next = prev.next.next;
        size--;


    }

    public void deleteLast() {

        if(head == null){
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }



        Node secondLast = get(size - 2);

        tail = secondLast;
        tail.next = null;
        size--;


    }


    public void deleteFirst() {

        if (head == null) {
            tail = null;
        }


        head = head.next;
        size--;
    }


    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.println("END");


    }


    private class Node {
        int val;
        Node next;


        public Node(int val) {
            this.val = val;
        }


        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


}
