public class Test {

    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(25);
        list.insertFirst(30);
        list.insertFirst(25);
        list.insertFirst(30);
        list.insertFirst(25);
        list.insertFirst(30);


        list.display();


        list.insertLast(99);





        list.display();


        list.insertMiddle(455, 4);

        list.display();

        list.deleteFirst();

        list.display();



        list.deleteLast();

        list.display();


        list.deleteMiddle(1);

        list.display();
    }
}
