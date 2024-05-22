public class DDLMain {
    public static void main(String[] args) {
        DoubleLinkedList myDLL = new DoubleLinkedList();
        //percobaan 1
            myDLL.print();
            myDLL.addFirst(800);
            myDLL.print();
            myDLL.addFirst(700);
            myDLL.print();
            myDLL.addLast(500);
            myDLL.print();
            myDLL.removeFirst();
            myDLL.print();
            myDLL.removeLast();
            myDLL.print();


            System.out.println("------------------------------------");
        //percobaan 2
            myDLL.add(5);
            myDLL.add(6);
            myDLL.add(7);
            myDLL.add(8);

            System.out.println("Data pada index ke 2 adalah : " + myDLL.getData(2));
            System.out.println("Indeks dari data 7 adalah " + myDLL.indexOf(7));

        //percobaan 3

            myDLL.reservePrint();
    }

}