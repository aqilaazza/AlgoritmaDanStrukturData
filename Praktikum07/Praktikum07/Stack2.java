package Praktikum07;
public class Stack2 {
    public int size;
    public char[] data;
    public int top; 

    public Stack2(int size) {
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(char dt) {
        if (!isFull()) {
            top++;
            data[top] = dt; 
        } else {
            System.out.println("Stack penuh");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char temp = data[top];
            top--;
            return temp;
        } else {
            return '\0';
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return '\0';
        }
    }

    public static boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.');
    }

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    public static int getDerajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public static String konversiInfix(String infix) {
        Stack2 operators = new Stack2(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix + c;
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix = postfix + operators.pop();
                }
                operators.pop(); 
            } else if (isOperator(c)) {
                //change
                while (!operators.isEmpty() && getDerajat(operators.peek()) >= getDerajat(c)) {
                    postfix = postfix + operators.pop();
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            postfix += operators.pop();
        }
        return postfix;
    }

    public static String konversiPostfix(String postfix) {
        Stack2 operands = new Stack2(postfix.length() * 2);
        char c;
    
        for (int i = 0; i < postfix.length(); i++) {
            c = postfix.charAt(i);
    
            if (isOperand(c)) {
                operands.push(c);
            } else if (isOperator(c)) {
                String operand2 = String.valueOf(operands.pop());
                String operand1 = String.valueOf(operands.pop());
                String hasil = "(" + operand1 + c + operand2 + ")";
                operands.push(hasil.charAt(0));
            }
        }
        return operands.pop() == '\0' ? "" : String.valueOf(operands.pop());
    }
    

    public static void main(String[] args) {
        System.out.println("Infix to Postfix");
        String infix = "5*4^(1+2)%3";
        System.out.println("Infix : " + infix);
        System.out.println("Postfix : " + konversiInfix(infix));

        System.out.println("Postfix to Infix");
        String postfix = "abcd-*+";
        System.out.println("Postfix : " + postfix);
        System.out.println("Infix : " + konversiPostfix(postfix));

    }
}
