public class DoubleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked List : ");
            Node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }   
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst (int input) {
        Node newNode = new Node(input);

        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node newNode = new Node(input);

        if(isEmpty()) {
            head = newNode;
            tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
   } 

   public void removeFirst() {
    if (isEmpty()){
        System.out.println("Linked List Kosong");
    } else if ( head == tail ){
        head = null;
        tail  = null;
    } else {
        head = head.next;
        head.prev = null;
    }
   }

   public void removeLast() {
    if (head == null) {
        System.out.println("Linked List Kosong");
    } else if (head == tail) {
        head = null;
        tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
   }

   int size;
   // Method getData untuk mengembalikan nilai elemen di dalam node pada index tertentu
   public int getData(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index tidak valid");
    }
    Node currentNode = head;
    for (int i = 0; i < index ; i++) {
        currentNode = currentNode.next;
    }
    return currentNode.data;
    }

 public int indexOf(int key) {
    Node current = head;
    int index = 0;
    while (current != null) {
        if (current.data == key) {
            return index;
        }
        index++;
        current = current.next;
    }
    return -1; // Mengembalikan -1 jika data tidak ditemukan (data tidak ditemukan)
}

public void add(int data) {
    Node newNode = new Node(data);

    if(head == null) {
        head = tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    size++;
}

public void reservePrint() {
    Node current = tail;
    while(current != null) {
        System.out.print(current.data + "\t");
        current = current.prev;
    }
}

public void insertAfter(int key, int input) {
    Node newNode = new Node(input);

    if(!isEmpty()) {
        Node currentNode = head;

        do {
            if(currentNode.data == key) {
                if(currentNode == tail) {
                    addLast(input);
                } else {
                    newNode.next = currentNode.next; 
                    newNode.prev = currentNode;
                    currentNode.next.prev = newNode;
                    currentNode.next = newNode;
                }
                break;
            }
            currentNode = currentNode.next;
        } while (currentNode != null);
    } else {
        System.out.print("Linked List Kosong");
    }
}

}