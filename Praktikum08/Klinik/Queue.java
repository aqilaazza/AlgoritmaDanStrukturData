package Klinik;

public class Queue {
    public Pasien[] data;
    public int max;
    public int size;
    public int front;
    public int rear;

    public Queue (int max) {
        this.max = max;
        this.data = new Pasien[max];
        this.size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return(size == max);
    }

    public void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen terdepan : " +data[front]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            int i = front;

            while(i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }

            System.out.println(data[i] + " ");
            System.out.println("Jumlah Elemen : " + size);
        }
    }

    public void clear () {
        front = rear = -1;
        size = 0;
    }

    public void enqueue (Pasien dt) {
        if(isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear =0;
            } else if (rear == max -1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }

            data[rear] = dt;
            size++;
        }
    }

    public Pasien dequeue() {
        Pasien temp = null;

        if(isEmpty()) {
            System.out.println("Queue masih kososng");
        } else {
            temp = data[front];
            size--;

            if(isEmpty()) {
                front = rear = -1;
            } else if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return temp;
    }

    public void peekRear () {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang : " + data[rear]);
        } else {
            System.out.println("Queue Kosong");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (data[i].nama.equalsIgnoreCase(nama)) {
                    System.out.println("Posisi pasien atas nama " +nama + " adalah antrian ke-" + i + 1);
                    return;
                }
            }
            System.out.println("Pasien dengan nomor identitas " + nama + " tidak ditemukan dalam antrian");
        } else {
            System.out.println("Queue kosong");
        }
    }
}