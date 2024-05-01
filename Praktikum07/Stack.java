public class Stack {
    public int size;
    public String[] data;
    public int top;

    public Stack (String postfix) {
        this.size = postfix;
        this.data = new String[postfix];
        this.top = -1;
    }

    public Stack(String postfix) {
        //TODO Auto-generated constructor stub
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size -1);
    }

    public void push(String dt) {
        if(!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh");
        }
    }
    
    public String pop() {
        if (!isEmpty()) {
            String temp = data[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public void clear() {
        top = -1;
    }

    public void print() {
        for(int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}